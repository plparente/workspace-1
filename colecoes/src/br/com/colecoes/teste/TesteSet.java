package br.com.colecoes.teste;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> lista = new HashSet<String>();
		lista.add("DBA");
		lista.add("DEV");
		lista.add("DBA");
		lista.add("Analista");
		lista.add("Estagiario");
		lista.add("Gerente");
		System.out.println(lista);
	}

}
