package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Vendas;
import br.com.ecommerce.tela.Magica;


public class TesteVendas {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produto produto = new Produto();
		Vendas vendas = new Vendas();
		Cliente cliente =new Cliente();
		Endereco endereco = new Endereco();
		
		
		// Essa amarra��o � para falar que o cliente tem o endereco, vendas tem o produto e vendas tem o cliente.
		cliente.setEndereco(endereco);
		vendas.setProduto(produto);
		vendas.setCliente(cliente);
		
		
		endereco.setLogradouro(Magica.s("Bairro"));
		
		produto.setValorVenda(Magica.f("Venda"));
		
		cliente.setId(Magica.i("digite o id"));
		
		System.out.println(cliente.getAll());
		System.out.println(vendas.getAll());
		
		
		//produto.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Produto")));
		//produto.setQtde(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do Produto")));
		//produto.setValorCompra(Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor de de Compra do Produto")));
		//produto.setValorVenda(Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor de de Venda do Produto")));
		
		//System.out.println(produto.getAll());
		//System.out.println(produto.getValorVenda());
		
		
		//endereco.setLogradouro(JOptionPane.showInputDialog("Logradouro"));
		//endereco.setBairro(JOptionPane.showInputDialog("Bairro"));
		//endereco.setCidade(JOptionPane.showInputDialog("Cidade"));
		/*
		vendas.setData((JOptionPane.showInputDialog("Digite a data da venda")));
		vendas.setTotal(Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor Total")));
		produto.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Produto")));
		produto.setQtde(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do Produto")));
		produto.setValorVenda(Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor de de Venda do Produto")));
		cliente.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do Cliente")));
		cliente.setNome((JOptionPane.showInputDialog("Digite Nome do Cliente")));
		endereco.setAll(
				
				JOptionPane.showInputDialog("Logradouro"),
				JOptionPane.showInputDialog("Bairro"),
				JOptionPane.showInputDialog("Cidade"),
				JOptionPane.showInputDialog("Estado"),
				JOptionPane.showInputDialog("CEP"),
				JOptionPane.showInputDialog("Numero"), 
				JOptionPane.showInputDialog("Complemento")
			
				);
		*/
		//System.out.println(cliente.getAll());
		//System.out.println(endereco.getAll());
		//System.out.println(vendas.getTotal());
		//System.out.println(endereco.getAll());
		
		
		
		
		
		
	}

	
	
}
