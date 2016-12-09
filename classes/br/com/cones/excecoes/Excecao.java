package br.com.cones.excecoes;

public class Excecao extends Exception{
	
	public Excecao(Exception e) {
		System.out.println("Ocorreu um erro!");
	}
	
	public Excecao(String mensagem, Exception e) {
		super(mensagem, e);
		if (e.getClass().toString().equals
				("class java.lang.NumberFormatException")){
			System.out.println("N�mero inv�lido");
		}else if (e.getClass().toString().equals
				("class java.lang.ArithmeticException")){
			System.out.println("Divis�o por 0");
		}
		this.print();
		e.printStackTrace();
		// Envia e-mail para o respons�vel
	}
	public Excecao(String mensagem) {
		//super("\n"+mensagem);
		System.out.println(mensagem);
		// Envia e-mail para o respons�vel
	}
	public void print() {
		System.out.println("========== Tratando Erro ===========");
		System.out.println(getMessage());
		System.out.println("PrintStackTrace:  ");
	}
}
