package br.com.univeridade.implementacao;

import br.com.universidade.modelo.Bacharelado;
import br.com.universidade.modelo.Formacao;

public class TestFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formacao f = new Bacharelado();
		f.setvalor(5000);
		f.definirDuracao();
		System.out.println(f.calcularMensalidade((float) 0.05));
		System.out.println(f.getDuracao());
	}

}
