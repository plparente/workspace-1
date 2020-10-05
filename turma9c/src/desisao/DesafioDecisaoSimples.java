package desisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome: ").toUpperCase();
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a nota 1: "));
		
		if(idade >= 18 && idade <= 70) {
			System.out.println(nome + ", o voto é obrigatorio ! ");
			}
		if(idade == 16 || idade == 17 || idade > 70) {
			System.out.println(nome + ", o voto é facultativo ! ");
			}
		if(idade < 16 ) {
			System.out.println(nome + ", Não pode votar ! ");
			}
		
	}
}
