package br.com.cones.bo;

import br.com.cones.beans.Cliente;
import br.com.cones.dao.DAO;
import br.com.cones.excecoes.Excecao;

public class ClienteBO {
	
	public String mostraCliente(Cliente c){
		return "CPF: " +  c.getCpf() + "/n" + 
				"Nome: " +  c.getNome() + "/n" + 
				"Setor: " +  c.getSetor() + "/n" + 
				"Predio: " +  c.getPredio() + "/n" + 
				"Andar: " +  c.getAndar();
	}
	public void Gravar(Cliente c) throws Exception, Excecao{
//		DAO dao = new DAO();
//		dao.gravar(c);
		
	}
}
