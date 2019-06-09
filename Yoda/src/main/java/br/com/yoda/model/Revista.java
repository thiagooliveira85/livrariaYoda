package br.com.yoda.model;

public class Revista extends TemplateProdutoDesconto {

	private Material material;

	public Revista(Material material, Double preco, TipoPagamento tipoPagamento) {
		super(preco, tipoPagamento);
		this.material = material;
	}
	
	public Material getMaterial() {
		return material;
	}
	
	@Override
	protected void aplicaDescontoMinimo() {
		aplicaDescontoDe(15.0);
	}

	@Override
	protected void aplicaDescontoMaximo() {
		aplicaDescontoDe(30.0);
	}

	@Override
	protected boolean deveUsarMaiorODesconto() {
		return material.equals(Material.IMPRESSO);
	}

	@Override
	protected boolean pagamentoAVista() {
		return tipoPagamento.equals(TipoPagamento.A_VISTA);
	}
	
}
