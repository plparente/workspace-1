package br.com.lojauati.teste;

import br.com.lojauati.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elevador objeto = new Elevador(50,25); // adicionado metodo construtor e parametros para forcar que n�o seja nula a informa��o de capacidade maxima de pessoas e Maior andar
		
		//Elevador outro = new Elevador();
		
		System.out.println(objeto.exibirTudo());
		
		//comentado esse bloco pois os parametros est�o sendo passado para o metodo construtor
		//objeto.preencherCapacidadePessoas(10);
		//objeto.preencherMaiorAndarint(20);
		//objeto.preencherMenorAndar(0);
		
		//System.out.println(objeto.exibirTudo());
		
		objeto.entrar(5);
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.subir();
		objeto.sair(2);
		System.out.println(objeto.exibirTudo());
	}

}
