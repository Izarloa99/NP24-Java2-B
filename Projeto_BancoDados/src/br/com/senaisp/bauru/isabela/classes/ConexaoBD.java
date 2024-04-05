package br.com.senaisp.bauru.isabela.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
	private static ConexaoBD instancia = null;
	private Connection conn;

//colocando o construtor como privado para criar somente aquilo
	private ConexaoBD() throws SQLException {
		conn = DriverManager.getConnection("jdbc:sqlite:C:\\JavaLibs\\Dados\\NP24_JAVA2_B.DB");
	}

//obtendo a instancia de forma padrão singleton
	public static ConexaoBD getInstancia() throws SQLException {
		if (instancia == null) {
			instancia = new ConexaoBD();
		}
		return instancia;
	}

	public Connection getConn() {
		return conn;
	}
}
