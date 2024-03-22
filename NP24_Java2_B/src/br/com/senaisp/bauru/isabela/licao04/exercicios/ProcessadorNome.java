package br.com.senaisp.bauru.isabela.licao04.exercicios;

public class ProcessadorNome {
	public String processarNome (String nome) {
		//Pegando o Sobrenome
		String sbnom = nome.substring(nome.lastIndexOf(' ')+1);
		String iniNom = "" + nome.charAt(0) + ".";
		return sbnom + ", " + iniNom;
	}

}
