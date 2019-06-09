package br.com.yoda.model;

public class Tabuleiro extends Produto implements Desconto {

	public Tabuleiro(double preco, TipoPagamento tipoPagamento) {
		super(preco, tipoPagamento);
	}

	public void aplicaDesconto() {
		aplicaDescontoDe(30.0);		
	}
	
	
}
