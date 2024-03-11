package Model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

import application.DataBaseConncetion;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginDAO {

	public boolean validateLogin(String nome, String senha) {
		try {
			DataBaseConncetion connectNow = new DataBaseConncetion();
			Connection connectDB = connectNow.getConnection();
			String sql = "SELECT * FROM Usuarios WHERE nome = ? AND senha = ?";
			PreparedStatement statement = connectDB.prepareStatement(sql);
			statement.setString(1, nome);
			statement.setString(2, senha);
			ResultSet resultado = statement.executeQuery();
			return resultado.next();
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
