package br.com.cones.testes;

import br.com.cones.beans.Cliente;
import br.com.cones.bo.ClienteBO;
import br.com.cones.dao.DAO;
import br.com.cones.excecoes.Excecao;

public class TesteClienteDAO {
	public static void main(String[] args) throws Excecao {
		try{
			Cliente c = new Cliente();
			c.setCpf("123");
			c.setNome("Gerson");
			c.setSetor("Suporte");
			c.setAndar(1);
			c.setPredio(2);
						//System.out.println("Gravado");
			
			ClienteBO bo = new ClienteBO();

			bo.Gravar(c);
			System.out.println(c.getNome());
			
			//System.out.println("Gravado");
		} catch (Exception e){
			throw new Excecao("falha");
		}
	}
}
