package br.com.itaumon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itaumon.dao.AgenciaDAO;
import br.com.itaumon.modelo.Agencia;

@RestController // tornar essa classe uma controller (responde os metodos HTTP )
@CrossOrigin("*") //permitir que requisiçoes externas sejam permitidas


public class AgenciaController {

	@Autowired  	// JPA ira gerenciar o objeto DAO
	private AgenciaDAO dao;
	
	@GetMapping("/agencias")
	public ResponseEntity<List<Agencia>> exibirTodos(){
		List<Agencia> lista = (List<Agencia>)dao.findAll();
		if(lista.size() == 0) {
			return ResponseEntity.status(404).build();
		}
			
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping("/novaagencia")
	public ResponseEntity<Agencia> cadastrar(@RequestBody Agencia novo){
		try {
			dao.save(novo);
			return ResponseEntity.ok(novo);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	
	@GetMapping("/agencias/{idAgencia}")
	public ResponseEntity<List<Agencia>> pesquisarId(@PathVariable Integer idAgencia){
		List<Agencia> lista = (List<Agencia>) dao.findByIdAgencia(idAgencia);
		if(lista.size() == 0) {
			return ResponseEntity.status(404).build();
		}
			
		return ResponseEntity.ok(lista);
	}
	
}
