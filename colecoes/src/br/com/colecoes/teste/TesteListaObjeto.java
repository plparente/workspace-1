package br.com.colecoes.teste;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.colecoes.modelo.Cargo;

public class TesteListaObjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Cargo> lista = new ArrayList<Cargo>(); // pode deixar assim ArrayList<>() mas só roda na JVM da 7 para frente...
		/*
		Cargo objeto = new Cargo();
		objeto.setNome(JOptionPane.showInputDialog("Cargo"));
		objeto.setNivel(JOptionPane.showInputDialog("Nivel"));
		objeto.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Salario")));
		lista.add(objeto);
		System.out.println(lista.get(0).getAll());

		System.out.println("---------------------------------------");
		
		*/
		do {
			lista.add(new Cargo(
					JOptionPane.showInputDialog("Cargo"),
					JOptionPane.showInputDialog("Nivel").toUpperCase(),
					Float.parseFloat(JOptionPane.showInputDialog("Salario"))
					));
			//System.out.println(lista.get(0).getAll());
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "Pergunta", JOptionPane.YES_NO_OPTION)==0);
		
		List<Cargo> nova = new ArrayList<Cargo>();
		double total=0;
		int qtdej=0;
		int qtdes=0;
		for (Cargo obj : lista) {
			System.out.println(obj.getAll());
			total+=obj.getSalario();
			if (obj.getNivel().equals("JR")) {
				qtdej++;
				
			}else if (obj.getNivel().equals("SR")) {
				qtdes++;
			}
			if(obj.getSalario()>5000) {
				nova.add(obj);
			}
		}
		System.out.println("-------------------------------------");
		System.out.println("Total: "+ total);
		System.out.println("Total de Jr: " + qtdej);
		System.out.println("Total de Sr: " + qtdes);
		
		System.out.println("-------------------------------------");
		
		System.out.println("Salarios maior de 5000 ");
		for (Cargo obj : nova) {
			System.out.println(obj.getAll());
		}
	}

}
