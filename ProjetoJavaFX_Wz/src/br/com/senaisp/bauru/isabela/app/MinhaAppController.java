package br.com.senaisp.bauru.isabela.app;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

public class MinhaAppController {

	@FXML Button btnCancelar;
	@FXML Button btnSalvar;
	@FXML MenuItem mnItTela01;
	
	@FXML public void mnItTela01Act() {
		System.out.println("Chamando tela 01");
	}
	@FXML public void btnSalvarAct() {
		System.out.println("Salvando os dados");
	}
	
	@FXML public void btnCancelarAct() {
		System.out.println("Cancelando os dados");
	}
	
}
