package variaveis;

import javax.swing.JOptionPane;

public class TomadaDeDecisao_if {

	public static void main(String[] args) {
		
		String tipo = JOptionPane.showInputDialog("Digite qual o tipo de graduação que realiza: ");
		
		if (tipo.equalsIgnoreCase("tecnólogo")) {
			
			System.out.println("2 até 3 anos");
		}
		else{
			 System.out.println("4 até 6 anos");
		}


	}

}
