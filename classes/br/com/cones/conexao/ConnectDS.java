package br.com.cones.conexao;

import java.sql.*;

public class ConnectDS{
	public static void main(String[] args) throws Exception {
		
	try{
		
		String connectionUrl= "jdbc:sqlserver://localhost:1433;" 
				+ "databaseName=Cones";
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();

	Connection conn = DriverManager.getConnection(connectionUrl, "sa", "119696");

	//System.out.println("Conexão obtida");
	} catch (SQLException ex){
		System.out.println("SQL Exception: " + ex.getMessage());
		System.out.println("SQL State: " + ex.getSQLState());
		System.out.println("Vendo Error:" + ex.getErrorCode());
		
	} catch(Exception e){
		System.out.println("Não foi possivel conectar ao banco");
	}
}
}