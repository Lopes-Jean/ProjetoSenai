package br.edu.senai.modelo;

public class ManipulaGasto extends EntradaESaida {

	private String origem;
	private int valor;
	
	//
	
	public ManipulaGasto(String saldo, String gastos, String receita, String origem, int valor) {
		super(saldo, gastos, receita);
		this.origem = origem;
		this.valor = valor;
	}



	public String getOrigem() {
		return origem;
	}



	public void setOrigem(String origem) {
		this.origem = origem;
	}



	public int getValor() {
		return valor;
	}



	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
