package variaveis;

import javax.swing.JOptionPane;

public class SalarioProfessor {

	public static void main(String[] args) {
		int num_aula=0;
		double aula_semanais = 4.5;
		double hora_aula = 0;
		double qtde_aula = 0;
		double qtde_hora_aula;
		double adicional = 0;
				
		num_aula = Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade aulas: " ));
		hora_aula = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora aula: "));
		
		qtde_aula = (num_aula*aula_semanais);
		qtde_hora_aula = (qtde_aula*hora_aula);
		adicional = (((qtde_hora_aula*50)/100)+qtde_hora_aula);
		
		
		System.out.printf("Salario Base: %.2f", qtde_hora_aula);
		System.out.printf("\nSalario Base + Adicional: %.2f", adicional);
		

	}

}
