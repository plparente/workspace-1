package variaveis;

import javax.swing.JOptionPane;

public class TomadaDeDecisao {

	public static void main(String[] args) {
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero de 1 a 3: "));
		
		switch(opcao){

		   case 1: {
		      System.out.println("Opcao 1(Novo) - selecionada");
		      break;
		   }

		   case 2: {
		      System.out.println("Opcao 2(Imprimir) - selecionada");
		      break;
		   }

		   case 3: {
		      System.out.println("Opcao 3(Sair) - selecionada");
		      break;
		   }

		   default: {
		      System.out.println("Opcao invalida, selecione 1,2 ou 3");
		   }
		}
	}
}
