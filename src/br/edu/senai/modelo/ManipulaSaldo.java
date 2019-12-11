package br.edu.senai.modelo;

import java.util.Scanner;

public class ManipulaSaldo extends Manipula {
	
	Scanner entrada = new Scanner(System.in);
	
	// Construtor vazio
	public ManipulaSaldo() {
		super();
	}

	
	// Contrutor com campos
	public ManipulaSaldo(String origem, double valor) {
		super(origem, valor);

	}
	
	public void atualizaSaldo(double saldo) {
		
		this.valor = saldo;
		
	}


	public void buscaSaldo() {
		
		
		System.out.println("Seu saldo atual é de: " + this.valor);
		
		// Criar forma de buscar o saldo disponível 
		
	}

}
