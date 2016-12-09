package br.com.cones.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;


import br.com.cones.beans.Cliente;
import br.com.cones.conexao.ConexaoFactory;

public class DAO  {
	private Connection conexao;
	
	public DAO() throws Exception {
		this.conexao = new ConexaoFactory().getConnection();
	}	
	public void gravar(Cliente c) throws Exception {
		String sql = "insert into CLIENTE (CODIGO,NOME,SETOR,PREDIO,ANDAR) values(?,?,?,?,?)";
		PreparedStatement estrutura = conexao.prepareStatement(sql);
		estrutura.setString(1, c.getCpf());
		estrutura.setString(2, c.getNome());
		estrutura.setString(3, c.getSetor());
		estrutura.setInt(4, c.getPredio());
		estrutura.setInt(5, c.getAndar());
		estrutura.execute();
		estrutura.close();	
		System.out.println("Gravado!!!");
	}
}

