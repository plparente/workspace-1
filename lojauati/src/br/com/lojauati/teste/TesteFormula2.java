package br.com.lojauati.teste;

import br.com.lojauati.modelo.Formula1;

public class TesteFormula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formula1 objeto = new Formula1();
		objeto.preencherTudo("mclaren", (float)150000.50, 10000);
		System.out.println(objeto.exibirPromocao());
		System.out.println(objeto.exibirPromocao(50));
		
		
		// manipular valor somente parametro por paramentro, com mais de um valor tem que fazer a quebra usando substring e etc...
		float novovalor = objeto.exibirPromocao(90);
		System.out.println(novovalor);
		
	}

}
