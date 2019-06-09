package br.com.yoda.model;

public class Game extends Produto{

	private Midia midia;

	public Game(Midia midia, double preco, TipoPagamento tipoPagamento) {
		super(preco, tipoPagamento);
		this.midia = midia;
	}

	public Midia getMidia() {
		return midia;
	}

}
