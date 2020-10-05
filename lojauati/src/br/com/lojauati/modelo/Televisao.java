package br.com.lojauati.modelo;

public class Televisao {

		private int canal;
		private boolean status;
		private int volume;
		
		public void aumentarVolume() {
			
			if(status==true) {
				if (volume < 100) {
					volume += 1;
			}
			}	
		}
		public void diminuirVolume() {
			if(status==true) {
				if (volume > 100) {
					volume -= 1;
			}
			}
		}
		public void mudarCanal(int parametro) {
			if(status==true) {
				if (parametro >= 0 && parametro <=60 ) {
				//System.out.println("entrou no IF");
					canal = parametro;
				}
			}
		}
		public void ligar() {
			status = true;
		}
		public void desligar() {
			status = false;
		}
		public boolean exibirStatus() {
			return status;
			
		}
		public String exibirTudo() {
			String resposta="Desligada";
			if(status == true) {
				resposta="Ligada";
			}
			return 
					"Canal:.....: " + canal + "\n" +
					"Volume.....: " + volume + "\n" +
					"Status.....: " + resposta + "\n";
					
		}
}


