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

import br.com.integracao.dao.UsuarioDAO;
import br.com.integracao.modelo.Usuario;


@RestController // tornar essa classe uma controller (responde os metodos HTTP )
@CrossOrigin("*") //permitir que requisiçoes externas sejam permitidas

public class UsuarioController {
	
	@Autowired  	// JPA ira gerenciar o objeto DAO
	private UsuarioDAO dao; // um DAO para manupular cada tabel, podemos ter varios dependendo da quantidade de tabela que vamos usar
	
	@GetMapping("/usuarios")
	public ResponseEntity<List<Usuario>> exibirTodos(){
		List<Usuario> lista = (List<Usuario>)dao.findAll();
		if(lista.size() == 0) {
			return ResponseEntity.status(404).build();
		}
			
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping("/usuario/{codigo}")
	public ResponseEntity<Usuario> getUsuario(@PathVariable int codigo){
		Usuario resposta = dao.findById(codigo).orElse(null);
		
		if( resposta == null) {
			return ResponseEntity.status(404).build();
			
		}
		return ResponseEntity.ok(resposta);
	}
	@PostMapping("/novousuario")
	public ResponseEntity<Usuario> cadastrar(@RequestBody Usuario novo){
		try {
			dao.save(novo);
			return ResponseEntity.ok(novo);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	@PostMapping("/login")
	public ResponseEntity<Usuario> logar(@RequestBody Usuario objeto){
		Usuario logado = dao.findByEmialAndSenha(objeto.getEmial(), objeto.getSenha());
		if(logado == null) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(logado);
		}
}
