package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;
import br.com.ecommerce.tela.Magica;

public class ImplementarVenda {
	public static void main(String[] args) {
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		Produto produto = new Produto();
		//faz a amarração(ligação)
		cliente.setEndereco(endereco);
		venda.setProduto(produto);
		venda.setCliente(cliente);
		// fim da amarração
		endereco.setBairro(Magica.s("Bairro"));
		endereco.setLogradouro(Magica.s("Logradouro"));
		endereco.setCep(Magica.s("CEP"));
		//preencheria todos de endereco
		cliente.setId(Magica.i("ID"));
		cliente.setNome(Magica.s("Nome"));
		produto.setDescricao("CHURROS");
		produto.setQtde(Magica.i("Qtde"));
		produto.setValorVenda(Magica.f("Valor Venda"));
		// preencheria todos de produto
		venda.setTotal(150);
		venda.setData("02/10/2020");
		venda.setNotafiscal(15);
		System.out.println(venda.getAll());

	}

}