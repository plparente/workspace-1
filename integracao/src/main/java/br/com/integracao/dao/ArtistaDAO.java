package br.com.integracao.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.integracao.modelo.Artista;

public interface ArtistaDAO extends CrudRepository<Artista, Integer>{
		List<Artista> findByNacionalidade(String nacionalidade);
		
	}

	

