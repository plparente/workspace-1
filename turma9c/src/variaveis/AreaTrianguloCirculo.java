package variaveis;

import javax.swing.JOptionPane;

public class AreaTrianguloCirculo {

	public static void main(String[] args) {
		double altura;
		double base;
		double areaRet;
		int Raio;
		double circ;
		double area;
		double pi = 3.14;
	
		
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Base: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura: "));
		Raio = Integer.parseInt(JOptionPane.showInputDialog("Digite a Raio:"));
		
		areaRet = (base * altura);
		
		System.out.println("A area do Retangulo de Base: " + areaRet);

		//int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a Altura:"));
		
		circ = 2*pi*Raio;
		
		System.out.printf("Comprimento da Circunferência: %.2f", circ);
		
		area = pi*Raio*Raio;
		System.out.printf("\nÁrea da Circuferência: %.2f", area);
	}

}
