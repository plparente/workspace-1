
package br.com.ecommerce.beans;

public class Venda {
	private int notafiscal;
	private String data;
	private float total;
	private Produto produto;
	private Cliente cliente;
	
	
	
	public Venda() {
		super();
	}
	public Venda(int notafiscal, String data, float total, Produto produto, Cliente cliente) {
		super();
		this.notafiscal = notafiscal;
		this.data = data;
		this.total = total;
		this.produto = produto;
		this.cliente = cliente;
	}
	public String getAll() {
		return
				"Nota Fiscal: " + notafiscal + "\n" +
				"Data: " + data + "\n" +
				"Total: " + total + "\n" +
				"Produto: \n" + produto.getAll() + "\n" +
				"Cliente: \n" + cliente.getAll();
	}
	public void setAll(int n, String d, float t, Produto p, Cliente c) {
		notafiscal=n;
		data=d;
		total=t;
		produto=p;
		cliente=c;
	}
	public int getNotafiscal() {
		return notafiscal;
	}
	public void setNotafiscal(int notafiscal) {
		this.notafiscal = notafiscal;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}