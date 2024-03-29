package br.com.senaisp.bauru.isabela.licao07.exercicio;

public class Terminal {
	private static int nId = 0;
	private CategoriaPremio categoria01;
	private CategoriaPremio categoria02;
	private CategoriaPremio categoria03;
	private int numeroTerminal;

//Construtor
	public Terminal() {
		numeroTerminal = ++nId;
		categoria01 = new CategoriaPremio("Gold", 25);
		categoria01 = new CategoriaPremio("Silver", 50);
		categoria01 = new CategoriaPremio("Bronze", 75);
	}
	
	//Getters e Setters
		public CategoriaPremio getCategoria01() {
			return categoria01;
		}
		public CategoriaPremio getCategoria02() {
			return categoria02;
		}
		public CategoriaPremio getCategoria03() {
			return categoria03;
		}
		public int getNumeroTerminal() {
			return numeroTerminal;
		}

	// Metodos
	public void consultarSaldoCartao(Cartao ct) {
		System.out.println("Operação: Saldo do Cartão");
		System.out.println("-".repeat(20));
		System.out.println(ct);
		System.out.println("-".repeat(20));
	}

	public void carregarCartao(Cartao ct, int valor) {
		System.out.println("Operação: Carregar saldo do Cartão");
		System.out.println("-".repeat(20));
		int nrCreditos = valor * 2;
		// Atribuindo os creditos
		ct.setCreditos(ct.getCreditos() + nrCreditos);
		// mostrando o saldo do cartão
		System.out.println(ct);
		System.out.println("-".repeat(20));
	}

	public void transferirCreditos(Cartao ori, Cartao des, int qtde) {
		System.out.println("Operação: Transferencias de Créditos");
		System.out.println("-".repeat(20));
		// teste quantidade
		if (ori.getCreditos() >= qtde && qtde>0) { // posso trocar
			int vlr = ori.getCreditos() - qtde;
			ori.setCreditos(des.getCreditos() + qtde);
			// tranferindo os creditos
			des.setCreditos(des.getCreditos() + qtde);
		} else {
			System.out.println("Creditos Insuficiente ou qtde zero!");
		}
		// mostrando os saldos
		System.out.println("Cartão Origem: ");
		System.out.println(ori);
		System.out.println("Cartão Destino: ");
		System.out.println(des);
		System.out.println("-".repeat(20));
	}

	public void transferirCreditos(Cartao ori, Cartao des) {
		transferirCreditos (ori, des, ori.getCreditos());
	}
	
	public void consultarPremios() {
		System.out.println("Operação: Consultar Prêmios");
		System.out.println("-".repeat(20));
		System.out.println(categoria01);
		System.out.println(categoria02);		
		System.out.println(categoria03);
		System.out.println("-".repeat(20));
	}
	
	public void resgatarPremio(Cartao ct,int nrCategoria) {
		CategoriaPremio apoio= null;
		System.out.println("Operação: ");
		switch(nrCategoria) {
		case 1: apoio = categoria01;break;
		case 2: apoio = categoria02;break;
		case 3: apoio = categoria03;break;
			default: System.out.println("Categoria Inválida!");
		}
		if (apoio != null) {
			int qtdNTicket = apoio.getQtdeTickets();
			if (ct.getTickets()>=qtdNTicket && 
				          apoio.getSaldoPremio()>=1 ) { //posso trocar
				//Debitando os tickets do cartão
				ct.setTickets(ct.getTickets() - qtdNTicket);
				//Debitar o premio da categoria
				apoio.setSaldoPremio(apoio.getSaldoPremio() - 1);
			} else {
				System.out.println("Sem saldo de "
						+ "tickets ou prêmios!");
			}//else da troca de tickets
			System.out.println("Prêmios:");
			System.out.println(categoria01);
			System.out.println(categoria02);
			System.out.println(categoria03);
			System.out.println("Saldo Cartão");
			System.out.println(ct);
		}//if da categoria
	}//fim do método troca
}//fim da classe