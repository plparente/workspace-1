package br.com.ecommerce.beans;

/*
 * DTO Modelo / Beans / JavaBeans
 * 1 Todos os atributos devem ser privados
 * 2 getter e setter
 * 3 Toda classe deve possuir no minimo dois contrutores um cheio e um vazio
 */

public class Cliente {
	private int id;
	private String nome;
	private Endereco endereco;
	
	public Cliente(int i, String n, Endereco e) {
		id=i;
		nome=n;
		endereco=e;
	}
	
	public Cliente() {
		
	}
	
	public String getAll() {
		return
				"ID.......: " + id + "\n" +
				"Nome.....: " + nome + "\n" +
				"Endereco.: \n" + endereco.getAll();
	}
	public void setAll(int i, String n, Endereco e) {
		id =i;
		nome=n;
		endereco=e;
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
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
