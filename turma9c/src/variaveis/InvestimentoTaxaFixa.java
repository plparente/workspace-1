package variaveis;

import javax.swing.JOptionPane;

public class InvestimentoTaxaFixa {

	public static void main(String[] args) {
		double capital = Double.parseDouble(JOptionPane.showInputDialog("Digite o capital de invetimento: "));
		double taxa = Double.parseDouble(JOptionPane.showInputDialog("Digite digite a taxa: " ));
		int periodo = Integer.parseInt(JOptionPane.showInputDialog("Digite o periodo em meses: " ));

		double montante = capital* ((1+ taxa/100));
		montante = Math.pow(montante,periodo);
		
		System.out.println("Montante: " + montante);
	}

}
