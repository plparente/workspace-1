package repeticao;

import javax.swing.JOptionPane;

public class DesafioRepeticao {
	/*
	* Jogador 1: vai digitar um n�mero inteiro
	* Jogador 2: tem que descobrir esse numero
	* Exibir o Parab�ns para o Jogador2 quando ele descobrir
	* Atualiza��es:
	* - o jogador2 ir� receber dicas enquanto ele n�o acertar
	* - no final tem que exibir qtas tentativas foram utilizadas pelo Jogador2
	*/

	public static void main(String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1"));
		//int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2"));
		int valor2 = 0;
		int contador = 0;
		do {
			contador +=1;
			valor2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2"));

			if(valor1 == valor2) {
				System.out.println("Parabens vc acertou: ");
				System.out.println("Numero de tentativas: " + contador);
			}
			else if(valor1 < valor2) {
				System.out.println("Dica o Valor 1 � Menor ");
			}
			//else if(valor1 > valor2) {
			else {
				System.out.println("Dica o Valor 1 � Maior ");
			}
			
			
		}while (valor1 != valor2);

	}
}