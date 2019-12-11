package br.edu.senai.modelo;

import java.util.Scanner;

public class ManipulaReceita extends Manipula  {

	Scanner entrada = new Scanner(System.in);

	// Cria construtor vazio
	public ManipulaReceita() {
		super();
	}

	
	//Construtor com campos
	public ManipulaReceita(String origem, double valor) {
		super(origem, valor);
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
	
	public void adicionaReceita() {
		System.out.println("Informe o valor que você deseja adicionar como receita: ");
		this.valor = entrada.nextDouble();
		
		
		System.out.println("Informe a origem da receita: ");
		this.origem = entrada.next();
		
		System.out.println("\n\tDados adicionados com sucesso!\n");
	}
	
	
}
