package br.com.ecommerce.beans;

//Herança é definido com "extends" e a classe pai ou super classe
public class PessoaFisica extends Cliente{

	private String cpf;
	private String rg;
	private String nascimento;
	
	public void setAll(int i, String n, Endereco e, String cpf, String rg, String nascimento) {
		super.setAll(i, n, e);
		this.cpf = cpf;
		this.rg = rg;
		this.nascimento = nascimento;
	}
	
	public String getAll() {
		return
				super.getAll() + "\n" +
				"CPF: " + cpf + "\n" +
				"RG: "+ rg + "\n" +
				"Nascimento: " + nascimento;
	}
	
	public PessoaFisica() {
		super();
	}
	public PessoaFisica(int i, String n, Endereco e, String cpf, String rg, String nascimento) {
		super(i, n, e);
		this.cpf = cpf;
		this.rg = rg;
		this.nascimento = nascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNascimento() {
		return nascimento;
	}
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
	
}
