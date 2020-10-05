package br.com.execucao.teste;

public class TesteExecucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int numero = Integer.parseInt("5");
			System.out.println(numero);
			
			String palavra=""; // null
			System.out.println(palavra.length());
			
			int valores[] = new int[2]; // 2
			valores[0] = 548;
			valores[1] = 234;
			valores[2] = 123;
			
			
		}catch(NumberFormatException erro) {
			//erro.printStackTrace();
			System.err.println("Numero invalido");
		}catch(NullPointerException erro) {
			System.err.println("Objeto Nulo");
		}catch(ArrayIndexOutOfBoundsException erro) {
			//erro.printStackTrace();
			System.err.println("Vetor Estourou");
		}catch(Exception erro) {
			System.err.println("Excesao desconhecida");
		}finally {
			System.out.println("ate logo");
		}
		
			
		
	}
}
