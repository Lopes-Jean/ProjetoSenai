package br.edu.senai.modelo;

import java.util.Scanner;

public class ManipulaGasto extends Manipula {

	private Scanner entrada;
	
	ManipulaSaldo manpSaldo;

	// Criando construtor Vazio
	public ManipulaGasto(Scanner entrada) {
		super();
		this.entrada = entrada;
		
		
	}


	//Construtor com campos
	public ManipulaGasto(String origem, double valor, Scanner entrada) {
		super(origem, valor);
		this.entrada = entrada;
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
	
	
	public double adicionaGasto() {
		System.out.println("Informe o valor que você deseja adicionar como gasto: ");
		this.valor = entrada.nextDouble();
		
		System.out.println(this.valor);
		System.out.println("Informe a origem do gasto: ");
		this.origem = entrada.next();
		
		System.out.println(this.origem);
		
//		String ID = "Gasto";
		
	//	double saldo = manpSaldo.getValor();
		
		//System.out.println(saldo);
		//saldo = saldo - valor;
		
//		escrever(ID, valor,origem, saldo);
//		escrever(saldo);
		
		
		System.out.println("\n\tDados adicionados com sucesso!\n");
		
		return valor;
		
		
	}
	
}
