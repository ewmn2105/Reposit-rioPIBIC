package Controller;

import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import Model.bo.LoginBO;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class JogoCoresController implements Initializable {

	@FXML
	private Button button1, button2, button3, button4, button5, button6;

	@FXML
	void Resposta(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "ACERTOU!");
		//button1.setStyle("-fx-background-color: green;");
		FXMLLoader fx = new FXMLLoader(JogoCoresController.class.getResource("/View/JogoCoresView2.fxml"));
		try {
			Scene s = new Scene((Parent) fx.load());
			Stage st = new Stage();
			st.setMaximized(true);
			//Stage st2 = Main.getStage();
			//st2.close();
			st.setScene(s);
			st.show();
		}catch(IOException e) {}

	}
	
	
	@FXML
	void Erro1(ActionEvent event) {
		//JOptionPane.showMessageDialog(null, "ERROOOOU");
		button2.setStyle("-fx-background-color: red;");
		Sons.getSong();

	}

	@FXML
	void Erro2(ActionEvent event) {
		//JOptionPane.showMessageDialog(null, "ERROOOOU");
		button3.setStyle("-fx-background-color: red;");
		Sons.getSong();
	}
	
	@FXML
	void EfeitoClick(MouseEvent event) {
		button1.setOpacity(0.7);
	}
	
	@FXML
	void EfeitoNoClick(MouseEvent event) {
		button1.setOpacity(1.0);
	}

	@FXML
	void EfeitoClick2(MouseEvent event) {
		button2.setOpacity(0.7);
	}
	
	@FXML
	void EfeitoNoClick2(MouseEvent event) {
		button2.setOpacity(1.0);
	}
	

	@FXML
	void EfeitoClick3(MouseEvent event) {
		button3.setOpacity(0.7);
	}
	
	@FXML
	void EfeitoNoClick3(MouseEvent event) {
		button3.setOpacity(1.0);
	}
	
	@FXML
	void EfeitoClick4(MouseEvent event) {
		button4.setOpacity(0.7);
	}
	
	@FXML
	void EfeitoNoClick4(MouseEvent event) {
		button4.setOpacity(1.0);
	}

	@FXML
	void EfeitoClick5(MouseEvent event) {
		button5.setOpacity(0.7);
	}
	
	@FXML
	void EfeitoNoClick5(MouseEvent event) {
		button5.setOpacity(1.0);
	}
	

	@FXML
	void EfeitoClick6(MouseEvent event) {
		button6.setOpacity(0.7);
	}
	
	@FXML
	void EfeitoNoClick6(MouseEvent event) {
		button6.setOpacity(1.0);
	}
	
	@FXML
	void Resposta2(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "ACERTOU!");
	}
	
	@FXML
	void Erro1B (ActionEvent event){
		button4.setStyle("-fx-background-color: red;");
		Sons.getSong();
	}
	
	@FXML
	void Erro2B (ActionEvent event) {
		button6.setStyle("-fx-background-color: red;");
		Sons.getSong();
	}


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
}