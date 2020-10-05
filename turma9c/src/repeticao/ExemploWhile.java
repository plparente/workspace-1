package repeticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Email").toLowerCase();
		while (email.indexOf("@")<2) {
			email = JOptionPane.showInputDialog("Email Novamente").toLowerCase();
		}
		System.out.println(email);
		String nome = JOptionPane.showInputDialog("Nome").toLowerCase();
		while (nome.length() <5 || nome.length() >= 15 ) {
			nome = JOptionPane.showInputDialog("Nome Novamente").toUpperCase();
		}
		System.out.println(nome);
	}

}
