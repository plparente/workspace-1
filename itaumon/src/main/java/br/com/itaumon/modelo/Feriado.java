package br.com.itaumon.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="tb_feriado")
public class Feriado {
	@Id // definie que esse atribulto se refere a chave primaria da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // define que a chave primaria sera autoincremeto
	@Column(name="id_feriado")
	private int idFeriado;
	
	@Column(name="nome_feriado", length=100)
	private String nomeFeriado;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy", shape=JsonFormat.Shape.STRING)
	@Column(name="data_inicio")
	private Date dataInicio;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy", shape=JsonFormat.Shape.STRING)
	@Column(name="data_fim")
	private Date dataFim;
	
	@ManyToOne
	@JsonIgnoreProperties("agencia")
	private Agencia agencia;

	public int getIdFeriado() {
		return idFeriado;
	}

	public void setIdFeriado(int idFeriado) {
		this.idFeriado = idFeriado;
	}

	public String getNomeFeriado() {
		return nomeFeriado;
	}

	public void setNomeFeriado(String nomeFeriado) {
		this.nomeFeriado = nomeFeriado;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Feriado(int idFeriado, String nomeFeriado, Date dataInicio, Date dataFim, Agencia agencia) {
		super();
		this.idFeriado = idFeriado;
		this.nomeFeriado = nomeFeriado;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.agencia = agencia;
	}

	public Feriado() {
		super();
	}



}
