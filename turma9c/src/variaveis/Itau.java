package variaveis;

import javax.swing.JOptionPane;

public class Itau {
	public static void main(String[] args) {

	String variavel = "hello worLD ";
	System.out.println("Original: " + variavel);
	System.out.println (" Maiúscula: " + variavel.toUpperCase());
	System.out.println (" Minúscula: " + variavel.toLowerCase());
	System.out.println (" Qtde de caracteres: " + variavel.length());
	
	String nome = "";
	int idade = 0;
	double altura = 0;
	double peso = 0;
	double imc;
	
	nome = JOptionPane.showInputDialog("Digite seu nome:");
	idade = Integer.parseInt(JOptionPane.showInputDialog("Digite seu Idade:"));
	altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua Altura:"));
	peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu Peso: "));
	
	System.out.println("Nome...: " + nome.toUpperCase());
	System.out.println("Idade..: " + idade);
	System.out.printf("Altura..: " + String.format("%.2f",altura));
	System.out.println("\nPeso...: " + peso);
	
	imc = peso/(altura*2);
	
	System.out.println(imc);
	
	}
}