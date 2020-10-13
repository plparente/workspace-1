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

import br.com.integracao.dao.MusicaDAO;
import br.com.integracao.modelo.Musica;

@RestController // tornar essa classe uma controller (responde os metodos HTTP )
@CrossOrigin("*") //permitir que requisiçoes externas sejam permitidas
public class MusicaController {	
	@Autowired
	private MusicaDAO dao;
	
	@PostMapping("/alterarlancamento")
	public ResponseEntity<Musica> atualizar(@RequestBody Musica objeto){
		try {
			
			Musica completa = dao.findById(objeto.getId()).orElse(null);
			completa.setLancamento(objeto.getLancamento());
			dao.save(completa);
			return ResponseEntity.ok(objeto);
		}catch(Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	
	@GetMapping("/lancamento/{valor}")
	public ResponseEntity<List<Musica>> pesquisarLancamento(@PathVariable int valor){
		List<Musica> lista = (List<Musica>) dao.findByLancamento(valor);
		if (lista.size()==0) {
			return ResponseEntity.status(404).build();
		}
		return ResponseEntity.ok(lista);
	}
	
	@PostMapping("/novamusica")
	public ResponseEntity<Musica> cadastrar (@RequestBody Musica objeto){
		try {
			dao.save(objeto);
			return ResponseEntity.ok(objeto);
		}
		catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();
		}
	}
	
	
	
}
