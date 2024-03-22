package br.com.senaisp.bauru.isabela.licao04.exercicios;

public class exercicio01 {
	public static void main (String[]args) {
		MetodosCalculo mc = new MetodosCalculo ();
		double tempC = mc.converterF2c(60.5);
		System.out.println("Temperatura em °C é " + tempC);
		
		
		// Calculando a hipotenusa
		double hip = mc.calcularHipotenusa(15, 10);
		System.out.println("Hipotenusa é " + hip);
		
		
		//Sorteando os valores dos dados
		System.out.println("Valor dos dados foi " + mc.jogarDados());

	}
	

}
