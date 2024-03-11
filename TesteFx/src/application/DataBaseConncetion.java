package application;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConncetion {
	public Connection databaselink;
	
	public Connection getConnection() {
		String usuario = "root";
		String senhasql = "root";
		String nomeBD = "BD";
		String url = "jdbc:mysql://localhost:3306/" +nomeBD;	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			databaselink = DriverManager.getConnection (url, "root", "root");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return databaselink;
	}

}
