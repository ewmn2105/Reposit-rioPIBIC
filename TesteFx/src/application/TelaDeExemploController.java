package application;

import java.awt.Button;

import java.io.IOException;
import java.net.URL;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import application.DataBaseConncetion;

public class TelaDeExemploController implements Initializable{
	private static Stage stage;
	private Button fechar;
	
    @FXML
    private TextField txtNome;

    @FXML
    private PasswordField txtSenha;

	@FXML
	void Funciona(ActionEvent event) {
		validateLogin();
	}

	public void validateLogin() {
		DataBaseConncetion connectNow = new DataBaseConncetion();
		Connection connectDB = connectNow.getConnection();
		String verifyLogin = "SELECT count(1) FROM Usuarios WHERE nome = '" + txtNome.getText() + "' AND senha = '" + txtSenha.getText()
				+ "'";
		try {
			Statement statement = connectDB.createStatement();
			ResultSet queryResult = statement.executeQuery(verifyLogin);
			while (queryResult.next()) {
				if (queryResult.getInt(1) == 1) {
					JOptionPane.showMessageDialog(null, "Login Correto");
				} else {
					JOptionPane.showMessageDialog(null, "Login Incorreto");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
