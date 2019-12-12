package br.edu.senai.modelo;

public class ManipulaSaldo extends Manipula {
	
	
	// Construtor vazio
	public ManipulaSaldo() { 
		super();
	}

	
	// Contrutor com campos
	public ManipulaSaldo(String origem, double valor) {
		super(origem, valor);

	}
	


	public void buscaSaldo() {
		
		// Criar forma de buscar o saldo disponível 
		System.out.println("Seu saldo atual é de: " + this.valor);
		
	}

}
