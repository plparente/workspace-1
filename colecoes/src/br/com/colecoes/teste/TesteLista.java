package br.com.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Collection Framework
		 * 
		 * 
		 */
		//String x[] new String[2];
		List<String> lista = new ArrayList();
		lista.add("DBA");
		lista.add("DEV");
		lista.add("DBA");
		lista.add("Analista");
		lista.add("Estagiario");
		System.out.println(lista);
		System.out.println(lista.get(1));
		lista.remove(2);
		System.out.println("Lista apos eliminar o terceiro item" + lista);
		Collections.sort(lista);
		System.out.println("Lista ordenada" + lista);
		
		for (int contador=0;contador<lista.size();contador++) {
			System.out.println("Cargo: " + lista.get(contador));
			
		}
		System.out.println("------------------------------------------" );
		
		
		for (String cargo : lista) {
			System.out.println("Cargo: " + cargo);
			
		}
		
	}

}
