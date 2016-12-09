package br.com.cones.beans;

public class Cliente {
	private String cpf;
	private String nome;
	private String setor;
	private int predio;
	private int andar;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public int getPredio() {
		return predio;
	}
	public void setPredio(int predio) {
		this.predio = predio;
	}
	public int getAndar() {
		return andar;
	}
	public void setAndar(int andar) {
		this.andar = andar;
	}
	public Cliente(String cpf, String nome, String setor, int predio, int andar) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.setor = setor;
		this.predio = predio;
		this.andar = andar;
	}
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	public Cliente(Cliente c) {
//
//	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	} 
//	public String mostraCliente(Cliente c){
//		return "CPF: " +  c.getCpf() + "/n" + 
//				"Nome: " +  c.getNome() + "/n" + 
//				"Setor: " +  c.getSetor() + "/n" + 
//				"Predio: " +  c.getPredio() + "/n" + 
//				"Andar: " +  c.getAndar();
//	}
}
