package variaveis;

import javax.swing.JOptionPane;

public class AnoNascimento {

	public static void main(String[] args) {
		int ano_nasc = 0;
		int ano_atual = 0;

		ano_nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento formato 1900: "));
		ano_atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual formato 2020: " ));
		
		int idade = (ano_atual - ano_nasc);
		int idade_futuro = (2050 - ano_atual);
		
		System.out.println("Idade: " + idade);
		System.out.println("Idade: " + (idade + idade_futuro));
		
	}

}
