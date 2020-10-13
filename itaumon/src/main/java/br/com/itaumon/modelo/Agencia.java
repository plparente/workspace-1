package br.com.itaumon.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="tb_agencia")
public class Agencia {
	
	@Id // definie que esse atribulto se refere a chave primaria da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // define que a chave primaria sera autoincremeto
	@Column(name="id_agencia")
	private int idAgencia;
	
	@Column(name="num_agencia")
	private int numAgencia;
	
	@Column(name="nome_agencia", length=100)
	private String nomeAgencia;
	
	
	@OneToMany(mappedBy="agencia", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("agencia")
	private List<Feriado> feriados;


	public int getIdAgencia() {
		return idAgencia;
	}


	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}


	public int getNumAgencia() {
		return numAgencia;
	}


	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}


	public String getNomeAgencia() {
		return nomeAgencia;
	}


	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}


	public List<Feriado> getFeriados() {
		return feriados;
	}


	public void setFeriados(List<Feriado> feriados) {
		this.feriados = feriados;
	}


	public Agencia(int idAgencia, int numAgencia, String nomeAgencia, List<Feriado> feriados) {
		super();
		this.idAgencia = idAgencia;
		this.numAgencia = numAgencia;
		this.nomeAgencia = nomeAgencia;
		this.feriados = feriados;
	}


	public Agencia() {
		super();
	}

	

	
}
