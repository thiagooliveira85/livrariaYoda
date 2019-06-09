package br.com.yoda.model;

import java.text.DecimalFormat;

public abstract class Produto {
	
	protected Double preco;
	protected TipoPagamento tipoPagamento;

	public Produto(Double preco, TipoPagamento tipoPagamento) {
		this.preco = preco;
		this.tipoPagamento = tipoPagamento;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	public void aplicaDescontoDe(double desconto) {
		this.preco = preco - (preco * (desconto/100));
	}
	
	public String getPrecoFormatado() {
		return "R$ " +  new DecimalFormat("#,###.00").format(preco); 
	}
	
}
