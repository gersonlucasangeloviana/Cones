package br.com.cones.testes;

import java.sql.Connection;

import br.com.cones.conexao.ConexaoFactory;

public class TesteConexao {
	public static void main(String args[]) throws Exception{
		Connection c = null;
		try{
			c = new ConexaoFactory().getConnection();
			System.out.println("Conexão aberta!");
		} catch(Exception e){
			System.out.println("Erro de Conexão");
		} finally{
			try{
				c.close();
			} catch (Exception e){
				System.out.println(e);
			}
		}
	}
}
