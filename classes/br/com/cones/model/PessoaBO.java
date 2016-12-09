package br.com.cones.model;

public class PessoaBO {


	public boolean validaPessoa(Pessoa p){
				
		if(p.getNome().equals("Alexandre")){
			
			return true;
		}else{
			
			return false;
		}
		
	}
	
	
}
