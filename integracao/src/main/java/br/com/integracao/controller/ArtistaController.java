package br.com.integracao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.integracao.dao.ArtistaDAO;
import br.com.integracao.modelo.Artista;
import br.com.integracao.modelo.Usuario;

@RestController // tornar essa classe uma controller (responde os metodos HTTP )
@CrossOrigin("*") //permitir que requisiçoes externas sejam permitidas

public class ArtistaController {

	@Autowired  	// JPA ira gerenciar o objeto DAO
	private ArtistaDAO dao; // um DAO para manupular cada tabel, podemos ter varios dependendo da quantidade de tabela que vamos usar
	
	@GetMapping("/artista")
	public ResponseEntity<List<Artista>> exibirTodos(){
		List<Artista> lista = (List<Artista>)dao.findAll();
		if(lista.size() == 0) {
			return ResponseEntity.status(404).build();
		}
			
		return ResponseEntity.ok(lista);
	}
	@GetMapping("/artista/{codigo}")
	public ResponseEntity<Artista> getUsuario(@PathVariable int codigo){
		Artista resposta = dao.findById(codigo).orElse(null);
		
		if( resposta == null) {
			return ResponseEntity.status(404).build();
			
		}
		return ResponseEntity.ok(resposta);
	}
	@PostMapping("/novoartista")
	public ResponseEntity<Artista> cadastrar(@RequestBody Artista novo){
		try {
			dao.save(novo);
			return ResponseEntity.ok(novo);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
}
