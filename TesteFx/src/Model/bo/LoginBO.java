package Model.bo;

import java.sql.Connection;
import java.sql.SQLException;

import Model.dao.LoginDAO;
import Model.vo.LoginVO;
public class LoginBO {//BO do login
	private LoginDAO loginDAO = new LoginDAO();
	
	public boolean verificaLogin (String nome, String senha) {//Método boolean que retorna verdadeiro ou falso dependendo do resultado vindo do loginDAO, especificamente do método verificaLogin
		return loginDAO.validateLogin(nome, senha);
	}

}