package variaveis;

import javax.swing.JOptionPane;

public class TomadaDeDecisao_if {

	public static void main(String[] args) {
		
		String tipo = JOptionPane.showInputDialog("Digite qual o tipo de gradua��o que realiza: ");
		
		if (tipo.equalsIgnoreCase("tecn�logo")) {
			
			System.out.println("2 at� 3 anos");
		}
		else{
			 System.out.println("4 at� 6 anos");
		}


	}

}
