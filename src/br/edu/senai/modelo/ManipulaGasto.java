package br.edu.senai.modelo;

import java.util.Scanner;

public class ManipulaGasto extends Manipula {

	Scanner entrada = new Scanner(System.in);

	// Criando construtor Vazio
	public ManipulaGasto() {
		super();
		
	}


	//Construtor com campos
	public ManipulaGasto(String origem, double valor) {
		super(origem, valor);
		// TODO Auto-generated constructor stub
	}





	public String getOrigem() {
		return origem;
	}



	public void setOrigem(String origem) {
		this.origem = origem;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	public void adicionaGasto() {
		System.out.println("Informe o valor que você deseja adicionar como gasto: ");
		this.valor = entrada.nextDouble();
		
		
		System.out.println("Informe a origem do gasto: ");
		this.origem = entrada.next();
		
		System.out.println("\n\tDados adicionados com sucesso!\n");
		
	}
	
}
