package Controller;
import java.awt.event.ActionEvent;
import java.io.IOException;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CadastroController{

    @FXML
    private TextField txtNome;

    @FXML
    private PasswordField txtSenha;
    
    @FXML
    void cadastrar(ActionEvent e) {
    	
    }
    
    @FXML
    void voltar(ActionEvent e2) {
    	/*FXMLLoader fx = new FXMLLoader(TelaDeExemploController.class.getResource("/View/PIBIC.fxml"));
		try {
			Scene s = new Scene((Parent) fx.load());
			Stage st = new Stage();
			st.setScene(s);
			st.show();
		} catch (IOException e) {

		}*/
    }

}