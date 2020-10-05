package br.com.ecommerce.beans;

public class PessoaJuridica extends Cliente {
	private String cnpf;
	private String ie;
	private String contato;
	
	public void setAll(int i, String n, Endereco e, String cnpf, String ie, String contato) {
		super.setAll(i, n, e);
		this.cnpf = cnpf;
		this.ie = ie;
		this.contato = contato;
	}
	
	public String getAll() {
		
		return
				super.getAll()+ "\n" +
				"CNPF: " + cnpf + "\n" +
				"IE: " + ie + "\n" +
				"Contato: " + contato + "\n";
	}
	
	public PessoaJuridica() {
		super();
	}
	public PessoaJuridica(int i, String n, Endereco e, String cnpf, String ie, String contato) {
		super(i, n, e);
		this.cnpf = cnpf;
		this.ie = ie;
		this.contato = contato;
	}
	public String getCnpf() {
		return cnpf;
	}
	public void setCnpf(String cnpf) {
		this.cnpf = cnpf;
	}
	public String getIe() {
		return ie;
	}
	public void setIe(String ie) {
		this.ie = ie;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	
	
	

}
