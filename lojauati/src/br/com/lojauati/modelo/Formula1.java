package br.com.lojauati.modelo;

public class Formula1 {
	private String escuderia = "";
	private float valor = 0;
	private int rpm = 0;

	//Sintaxe para criação de metodos no java
	// <modificador> <tipo do retorno> (<tipo do paramentro>) {...}
	// metodo recebe um parametro que esta vindo do package Formula1teste.java
	public void preencherEscuderia(String parametro) {
		escuderia = parametro.toUpperCase();

	}
	//metodo para retornar a escuderia
	public String exibirEscuderia() {
		return escuderia;
	}
	public void preencherValor(float valorLoja) {

		if(valorLoja > 0) {
			valor = valorLoja;
		}

	}
	public void preencherRpm(int parametro) {
		rpm = parametro;
	}

	public float exibirValor() {
		return valor;

	}
	public int exibirRpm() {
		return rpm;

	}
	public void preencherTudo( String parametro1, float paramentro2, int paramentro3) {
		escuderia = parametro1.toUpperCase();
		valor = paramentro2;
		rpm = paramentro3;
		
	}
	
	public String exibirTudo() {
		return escuderia + "\n" + valor + "\n" + rpm;
		
	}

	public float exibirPromocao() {
		return valor * (float) 0.9;
	}
	
	public float exibirPromocao( float porc) {
		return valor - valor * (porc/100);
	}
}
