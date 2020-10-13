package br.com.itaumon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.itaumon.dao.UsuarioDAO;
import br.com.itaumon.modelo.Usuario;

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
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> logar(@RequestBody Usuario objeto){
		Usuario logado = dao.findByFuncionalAndSenhaUsuario(objeto.getFuncional(), objeto.getSenhaUsuario());
		if(logado == null) {
			logado = dao.findByRacfAndSenhaUsuario(objeto.getRacf(), objeto.getSenhaUsuario());
			if(logado == null) {
				return ResponseEntity.status(404).build();
			}
		}
		return ResponseEntity.ok(logado);
		}
}
