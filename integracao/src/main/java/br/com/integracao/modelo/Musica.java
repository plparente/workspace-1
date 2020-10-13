package br.com.integracao.modelo;

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
@Table(name="tb_musica")

public class Musica {
	
	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="titulo", length=70)
	private String titulo;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd/MM/yyyy", shape=JsonFormat.Shape.STRING)
	@Column(name="cadastro")
	private Date catastro;
	
	@Column(name="lancamento")
	private int lancamento;
	
	/*
	 * no BD Relacional
	 * 1-N - ManyToOne
	 * 1-0 - OneToMany
	 * 1-1 - OneToOne
	 * 
	 */
	@ManyToOne
	@JsonIgnoreProperties("musica")
	private Artista artista;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Date getCatastro() {
		return catastro;
	}


	public void setCatastro(Date catastro) {
		this.catastro = catastro;
	}


	public int getLancamento() {
		return lancamento;
	}


	public void setLancamento(int lancamento) {
		this.lancamento = lancamento;
	}


	public Artista getArtista() {
		return artista;
	}


	public void setArtista(Artista artista) {
		this.artista = artista;
	}


	public Musica(int id, String titulo, Date catastro, int lancamento, Artista artista) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.catastro = catastro;
		this.lancamento = lancamento;
		this.artista = artista;
	}


	public Musica() {
		super();
	} 
	
	
}
