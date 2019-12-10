package br.edu.senai.modelo;

public class ManipulaSaldo extends EntradaESaida {
	
	private int valor;

	public ManipulaSaldo(String saldo, String gastos, String receita, int valor) {
		super(saldo, gastos, receita);
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	
	

}
