package br.com.senaisp.bauru.isabela.secao03;

import javax.swing.JOptionPane;

public class JavaLibsPractice {

    public static String nome;
    public static int idade;

	public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Qual o seu nome:");
        JOptionPane.showMessageDialog(null,"Olá " + nome);
        
    String idade = JOptionPane.showInputDialog("Qual sua idade:");
        JOptionPane.showMessageDialog(null,"Você tem " + idade + " anos");
        
    //String = JOptionPane.showInputDialog("");
      //  JOptionPane.showMessageDialog(null, "" +   ;)
     
    }   
}