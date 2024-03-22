package br.com.senaisp.bauru.isabela.licao04.exercicios;

import javax.swing.JOptionPane;

public class exercicio02 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome completo:");
		ProcessadorNome pn = new ProcessadorNome ();
		System.out.println(pn.processarNome(nome));

	}

}
