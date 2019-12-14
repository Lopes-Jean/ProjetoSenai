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
		
		// Comando para buscar o saldo disponível 
		System.out.println("Seu saldo atual é de: " + this.valor + "\n");
		
	}

}

