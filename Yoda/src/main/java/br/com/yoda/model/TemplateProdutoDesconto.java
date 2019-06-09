package br.com.yoda.model;

public abstract class TemplateProdutoDesconto extends Produto implements Desconto {

	public TemplateProdutoDesconto(Double preco, TipoPagamento tipoPagamento) {
		super(preco, tipoPagamento);
	}

	public void aplicaDesconto() {
		
		if (pagamentoAVista()) {
			if (deveUsarMaiorODesconto())
				aplicaDescontoMaximo();
			else
				aplicaDescontoMinimo();
		}
		
	}

	protected abstract boolean pagamentoAVista();

	protected abstract void aplicaDescontoMinimo();

	protected abstract void aplicaDescontoMaximo();

	protected abstract boolean deveUsarMaiorODesconto();

}
