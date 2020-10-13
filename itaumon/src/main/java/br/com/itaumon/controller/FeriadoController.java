package br.com.itaumon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itaumon.dao.FeriadoDAO;
import br.com.itaumon.modelo.Feriado;

@RestController // tornar essa classe uma controller (responde os metodos HTTP )
@CrossOrigin("*") //permitir que requisiçoes externas sejam permitidas

public class FeriadoController {
	
	@Autowired  	// JPA ira gerenciar o objeto DAO
	private FeriadoDAO dao;
	
	@GetMapping("/feriados")
	public ResponseEntity<List<Feriado>> exibirTodos(){
		List<Feriado> lista = (List<Feriado>)dao.findAll();
		if(lista.size() == 0) {
			return ResponseEntity.status(404).build();
		}
			
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping("/novoferiado")
	public ResponseEntity<Feriado> cadastrar(@RequestBody Feriado novo){
		try {
			dao.save(novo);
			return ResponseEntity.ok(novo);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
}
