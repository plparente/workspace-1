package desisao;

import javax.swing.JOptionPane;

public class Exercicio1Lista2 {

	/*
	 * 1. Um hotel cobra R$ 80,00 a di�ria e mais uma taxa de servi�os. 
		A taxa de servi�os � de: 
	�	R$ 5,50 por di�ria, se o n�mero de di�rias for maior que 15; 
	�	R$ 6,00 por di�ria, se o n�mero de di�rias for igual a 15; 
	�	R$ 8,00 por di�ria, se o n�mero de di�rias for menor que 15.
		Monte uma aplica��o que apresente a conta do cliente.

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Digite a quantidade de diaria: "));
		float taxa =0;
		if(diarias > 15) 
		{
			taxa=(float)5.5;
		}
		else if(diarias < 15) 
		{
			taxa=(float)8;
		}
		else 
		{
			taxa=(float)6;
		}
		float valor = 80 + taxa;
		System.out.println("Total: " + (valor * diarias));
	}

}
