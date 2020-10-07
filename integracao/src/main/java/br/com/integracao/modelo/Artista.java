package br.com.integracao.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_artista")
public class Artista {

	@Id // definie que esse atribulto se refere a chave primaria da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // define que a chave primaria sera autoincremeto
	@Column(name="id")
	private int id;
	
	@Column(name="nome", length=50)
	private String nomeArtistico;
	
	@Column(name="nacionalidade", length=50)
	private String nacionalidade;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeArtistico() {
		return nomeArtistico;
	}
	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public Artista(int id, String nomeArtistico, String nacionalidade) {
		super();
		this.id = id;
		this.nomeArtistico = nomeArtistico;
		this.nacionalidade = nacionalidade;
	}
	public Artista() {
		super();
	}
	
	
	
}
