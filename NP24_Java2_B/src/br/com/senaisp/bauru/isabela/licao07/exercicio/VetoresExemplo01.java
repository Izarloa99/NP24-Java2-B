package br.com.senaisp.bauru.isabela.licao07.exercicio;

public class VetoresExemplo01 {

	public static void main(String[] args) {
		//criando um vetor de 50 posições inteiras
		int [] [] [] [] idades = new int [50] [10] [10] [10];
		//criar de forma estatica vetores
		String[] cores = {"Azul", "Amarelo", "Vermelho", "Verde"};
		cores[2] = "Laranja";
		//essa linha abaixo representa o mesmo que a anterior
		String[] cor_n = new String [4];
		cor_n[0] = new  String ("Azul");
		cor_n[1] = "Amarelo";
		cor_n[2] = "Vermelho";
		cor_n[3] = "Verde";
		//cor_n[4] = "Roxo"; // ArrayIndexOutOfBounds
		//Utilizando o for in
		for (String item: cores) {
			System.out.println(item);
		}


 
	}

}
