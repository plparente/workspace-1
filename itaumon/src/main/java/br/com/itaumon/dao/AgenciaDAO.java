package br.com.itaumon.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.itaumon.modelo.Agencia;

public interface AgenciaDAO extends CrudRepository<Agencia, Integer>{
	List<Agencia> findByIdAgencia(Integer idAgencia);
	
}







