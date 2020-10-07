package br.com.integracao.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// usado pelo JPA para interpretar a relação da tabela no banco
// indica que a classe abaixo tera uma tabela correspondente no banco
@Entity
@Table(name="tb_name")


public class Usuario {
	@Id // definie que esse atribulto se refere a chave primaria da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // define que a chave primaria sera autoincremeto
	@Column(name="id")
	private int id;
	
	@Column(name="nome", length=50)
	private String nome;
	
	@Column(name="emial", length=70)
	private String emial;
	
	@Column(name="senha",length=20)
	private String senha;
	
	@Column(name="foto", length=100)
	private String foto;
	
	
	public Usuario() {
		super();
	}
	public Usuario(int id, String nome, String emial, String senha, String foto) {
		super();
		this.id = id;
		this.nome = nome;
		this.emial = emial;
		this.senha = senha;
		this.foto = foto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmial() {
		return emial;
	}
	public void setEmial(String emial) {
		this.emial = emial;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
	
}
