package br.com.ecommerce.beans;

public class Produto {
	private int id;
	private String desc;
	private int qtde;
	private float valorCompra;
	private float valorVenda;
	
	public String getAll() {
		return
				"ID do Produto.....:" + id + "\n" +
				"Descriçao.....:" + desc + "\n" +
				"Quantidade.....:" + qtde + "\n" +
				"Valor de Compra.....:" + valorCompra + "\n" +
				"Valor de Venda.....:" + valorVenda + "\n";
			
		}
	
	public void setAll(int id, String desc, int qtde, float valorCompra, float valorVenda) {
		this.id = id;
		this.desc = desc;
		this.qtde = qtde;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
			
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	
}
