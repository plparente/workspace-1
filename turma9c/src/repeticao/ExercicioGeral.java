package repeticao;

import javax.swing.JOptionPane;

public class ExercicioGeral {
	/*
	 * Monte uma aplica��o que solicite a idade e o nome das pessoas.
	 * Ao terminar (o usu�rio respondeu que n�o quer continuar),
	 * A aplica��o dever� exibir:
	 * - a pessoa mais velha (nome), (3)
	 * - a pessoa mais nova (nome), (4)
	 * - a quantidade de pessoas maiores de idade e (1)
	 * - a m�dia entre as idades que foram digitadas. (2)
	 */
	public static void main(String[] args) {
		char resposta = 0;
		int maiorDeIdade = 0;
		int maisNova = 1000;
		String nomeNova = "";
		int maisVelha =0;
		String nomeVelha = "";

		//float media = 0;
		String nome = "";
		int idade = 0;

		do {

			nome = (JOptionPane.showInputDialog("Nome: ")).toUpperCase();
			idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));

			if(idade >= 18) {
				maisVelha = idade;
				nomeVelha = nome;
				maiorDeIdade +=1;
			}
			else if( idade <= maisNova) {
				maisNova = idade;
				nomeNova = nome;

			} 
			else if( idade >= maisVelha) {
				maisVelha = idade;
				nomeVelha = nome;

			}

			resposta = JOptionPane.showInputDialog("Digite <S> para continuar").toUpperCase().charAt(0);
		}while(resposta =='S');
		System.out.println("Nome pessoa mais Nova: " + nomeNova + ", Idade: " + maisNova);
		System.out.println("Nome pessoa mais Velha:  " + nomeVelha + ", Idade: " + maisVelha);
		System.out.println("Quantidade de pessoas maiores de idade: " + maiorDeIdade);
		System.out.println("Media : " + (maisNova+maisVelha)/2);
	}

}
