package desisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	// Solicite para o usuário:
	// nome do cliente, valorInvestido investido,
	// tempo (anos) de fidelidade, região (nivel Brasil) onde mora
	// Se a região for sul ou sudeste, o tempo de fidelidade terá um acréscimo
	// de 20%
	// Se o valorInvestido investido for menor que 1000, aplique um acrescimo de 1.5%
	// no valorInvestido investido.
	// Se o valorInvestido investido estiver entre 1000 e 5000, aplique um acrescimo
	// de 2% no valorInvestido investido.
	// Se o valorInvestido investido for maior que 5000, aplique um acrescimo de 3% no valorInvestido investido.
	// Se a fidelidade for maior que 5 anos, aplique mais um acrescimo de 1% no valorInvestido investido.

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome : ").toUpperCase();
		String regiao = JOptionPane.showInputDialog("Digite a região : ").toUpperCase();
		double valorInvestido = Double.parseDouble(JOptionPane.showInputDialog("Digite o valorInvestido investido: "));
		float tempo = Float.parseFloat(JOptionPane.showInputDialog("Digite o tempo de fidelidade: "));
		float valorAtual =0;

		if (regiao.equalsIgnoreCase("sul") || regiao.equalsIgnoreCase("sudeste") ){
			tempo = tempo + ((tempo * (float) 20)/100);
		}
		else {
			if(valorInvestido < 1000 ) {
				valorInvestido = valorInvestido + ((valorInvestido * (float) 1.5)/100);
			}
			if (valorInvestido >= 1000 && valorInvestido <= 5000) {
				valorInvestido = valorInvestido + ((valorInvestido * (float) 2.0 )/100);
			}
			if (valorInvestido > 5000 ) {
				valorInvestido = valorInvestido + ((valorInvestido * (float) 3.0 )/100);
			}

			System.out.println("Nome: "+ nome +", valorInvestido: " + valorInvestido + ", Tempo: " + tempo);
		}
	}

}
