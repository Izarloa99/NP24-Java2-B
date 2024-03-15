package br.com.senaisp.bauru.isabela.secao03;

public class Chickens02 {
    public static void main(String[] args) {
    	   	
    	//Definindo a variavel
    	int totalEggs=0;
    	double dailyAverage=0,monthlyAverage=0, monthlyProfit=0;
    	//Na segunda-feira, o Fazendeiro Fred recolhe 100 ovos
    	totalEggs+=100;
    	//Na terça-feira, ele recolhe 121 ovos
    	totalEggs+=121;
    	//Na quarta-feira, ele recolhe 117 ovos
    	totalEggs+=117;
    	//Fazendo as contas 
    	dailyAverage= totalEggs / 3.0;
    	monthlyAverage= dailyAverage * 30;
    	monthlyProfit= monthlyAverage * 0.18;

        System.out.println("Daily Average:   " +dailyAverage);
        System.out.println("Monthly Average: " +monthlyAverage);
        System.out.println("Monthly Profit:  $" +monthlyProfit);
    }
}
