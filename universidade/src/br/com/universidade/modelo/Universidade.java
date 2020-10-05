package br.com.universidade.modelo;

public class Universidade {
	private int rm;
	private String nome;
	private String email;
	
	public void preencherRm(int prm) {
		rm = prm;
	}
	public void preencherNome(String pnome) {
		nome = pnome;
	}
	public void preencherEmail(String pemail) {
		email = pemail;
	}
	
	public int exibirRm() {
		return rm;
	}
	public String exibirNome() {
		return nome;
	}
	public String exibirEmail() {
		return email;
	}
}
