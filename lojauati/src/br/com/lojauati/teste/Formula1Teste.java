package br.com.lojauati.teste;

import javax.swing.JOptionPane;

import br.com.lojauati.modelo.Formula1; // atalho para iportar Ctrl+Shift+o

public class Formula1Teste {

	public static void main(String[] args) {
		//criando um objeto
		Formula1 objeto;
		
		// instanciando um objeto
		Formula1 carro = new Formula1(); 
		
		// Passando valor statico
		//carro.preencherEscuderia("ferrari");
		//carro.preencherValor((float) 100.000);
		//carro.preencherRpm((int) 5000);
						
		//carro.preencherEscuderia(JOptionPane.showInputDialog("Digite a Escuderia" ));
		//carro.preencherRpm(Integer.parseInt(JOptionPane.showInputDialog("Digite o RPM" )));
		//carro.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor" )));
		
		//System.out.println("Escuderia.:" + carro.exibirEscuderia());
		//System.out.println("RPM.......:" + carro.exibirRpm());
		//System.out.println("Valor.....:" + carro.exibirValor());
		
		
		// preencher tudo 
		
		
		carro.preencherTudo((JOptionPane.showInputDialog("Digite a Escuderia" )), Float.parseFloat(JOptionPane.showInputDialog("Digite o Valor" )),  Integer.parseInt(JOptionPane.showInputDialog("Digite o RPM" )));
		System.out.println("Retorno\n" + carro.exibirTudo());
	}

}
