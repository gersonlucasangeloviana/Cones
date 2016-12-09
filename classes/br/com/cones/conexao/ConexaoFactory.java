package br.com.cones.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	public Connection getConnection() throws SQLException{
		try{
			
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

		} catch(Exception e){
			System.out.println("Não foi possivel conectar ao banco");
		}
		
		return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" 
				+ "databaseName=Cones", "sa", "119696");
	}
	

}