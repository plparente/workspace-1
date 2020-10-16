package br.com.itaumon.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_usuario")
public class Usuario {

	@Id // definie que esse atribulto se refere a chave primaria da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // define que a chave primaria sera autoincremeto
	@Column(name="id_usuario")
	private int idUsuario;
	
	@Column(name="nome_usuario", length=50)
	private String nomeUsuario;
	
	@Column(name="racf")
	private String racf;
	
	@Column(name="funcional")
	private String funcional;
	
	@Column(name="senha_usuario")
	private String senhaUsuario;
	
	@Column(name="foto_usuario")
	private String fotoUsuario;
	
	public String getFotoUsuario() {
		return fotoUsuario;
	}

	public void setFotoUsuario(String fotoUsuario) {
		this.fotoUsuario = fotoUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getRacf() {
		return racf;
	}

	public void setRacf(String racf) {
		this.racf = racf;
	}

	public String getFuncional() {
		return funcional;
	}

	public void setFuncional(String funcional) {
		this.funcional = funcional;
	}

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public Usuario(int idUsuario, String nomeUsuario, String racf, String funcional, String senhaUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.racf = racf;
		this.funcional = funcional;
		this.senhaUsuario = senhaUsuario;
	}

	public Usuario() {
		super();
	}
	
	


	
}
