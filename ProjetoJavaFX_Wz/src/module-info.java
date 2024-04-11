module ProjetoJavaFX_Wz {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens br.com.senaisp.bauru.isabela.app to javafx.graphics, javafx.fxml;
}
