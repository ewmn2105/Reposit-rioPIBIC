package Controller;

import java.awt.Button;

import java.io.IOException;
import java.net.URL;

import javax.swing.JOptionPane;

import Model.bo.LoginBO;
import Model.dao.LoginDAO;
import Model.vo.LoginVO;

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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import application.DataBaseConncetion;
import application.Main;

public class TelaDeExemploController implements Initializable {
	private static Stage stage;
	private Button fechar;

	private LoginBO loginBO = new LoginBO();

	@FXML
	private TextField txtNome;

	@FXML
	private PasswordField txtSenha;

	@FXML
	void Funciona(ActionEvent event) {
		String txtName = txtNome.getText();
		String txtPass = txtSenha.getText();
		boolean logado = loginBO.verificaLogin(txtName, txtPass);
		if (logado == true) {
			FXMLLoader fx = new FXMLLoader(TelaDeExemploController.class.getResource("/View/JogoCoresView.fxml"));
			try {
				Scene s = new Scene((Parent) fx.load());
				Stage st = new Stage();
				Stage st2 = Main.getStage();
				st2.close();
				st.setScene(s);
				st.setMaximized(true);
				st.show();
			} catch (IOException e) {

			}
		} else if (logado == false) {
			JOptionPane.showMessageDialog(null, "Incorreto Login");
		}
	}

	@FXML
	void fechar(ActionEvent event2) {
		Stage stage = Main.getStage();
		stage.close();
	}

	@FXML
	void abreCadastro(ActionEvent event3) {
		FXMLLoader fx = new FXMLLoader(TelaDeExemploController.class.getResource("/View/Cadastro.fxml"));
		try {
			Scene s = new Scene((Parent) fx.load());
			Stage st = new Stage();
			Stage st2 = Main.getStage();
			st2.close();
			st.setScene(s);
			st.show();
		} catch (IOException e) {

		}
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
}
