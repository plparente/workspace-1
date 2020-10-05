package desisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {
		/*Identificadores = nomes (classes, variaveis)
		 * Regras
		 * 1 Nao iniciar variavel com numero
		 * 2 N�o usar caracteres especiais @,#,!
		 * 3 N�o utilizare palavras reservadas class, int, main, new, public
		 * 4 
		 * 
		 * Padroes (variaaveis)
		 * - nomes significativos
		 * - sempre iniciar com letra minuscula
		 * - utilizar padrao Camel case ( nomeDoCliente, nome_do_cliente )
		 *
		 * 
		 * 
		 */
	public static void main(String[] args) {
		
		String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno: ").toUpperCase();
		float notaAluno1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1: "));
		float notaAluno2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2: "));
		float media = (notaAluno1 + notaAluno2)/2;
		
		System.out.println("Aluno: " + nomeAluno + ", sua media foi " + media + ".");
		
		if ( media >= 6) {
			System.out.println("Parabens: " + nomeAluno + ", Voce esta aprovado !");
		}
		if ( media <= 4) {
			System.out.println("Laskou: " + nomeAluno + ", Voce esta reprovado !");
			
			// and - &&
			// or - ||
		}
		if ( media > 4 && media <= 5.9) {
			System.out.println("Ainda tem chance: " + nomeAluno + "sua nota foi " + media);
		}
	}
}
