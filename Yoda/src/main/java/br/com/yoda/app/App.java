package br.com.yoda.app;

import br.com.yoda.model.Game;
import br.com.yoda.model.Livro;
import br.com.yoda.model.Material;
import br.com.yoda.model.Midia;
import br.com.yoda.model.Revista;
import br.com.yoda.model.Tabuleiro;
import br.com.yoda.model.TipoPagamento;

public class App {
	
	
	public static void main(String[] args) {
		
		TipoPagamento aVista = TipoPagamento.A_VISTA;
		
		Livro livroImpresso = new Livro(Material.IMPRESSO, 50.0, aVista);
		Revista revistaImpressa = new Revista(Material.IMPRESSO, 20.0, aVista);
		
		Livro livroDigital = new Livro(Material.DIGITAL, 35.0, aVista);
		
		Tabuleiro tabuleiro = new Tabuleiro(80.0, aVista);
		Game gameFisico = new Game(Midia.FISICA, 200.0, aVista);
		Game gameDigital = new Game(Midia.DIGITAL, 120.0, aVista);
		
		
		System.out.println("Livro Impresso = " + livroImpresso.getPrecoFormatado());
		System.out.println("Revista Impresso = " + revistaImpressa.getPrecoFormatado());
		System.out.println("Livro Digital = " + livroDigital.getPrecoFormatado());
		System.out.println("tabuleiro " + tabuleiro.getPrecoFormatado());
		System.out.println("Game Físico = " + gameFisico.getPrecoFormatado());
		System.out.println("Game Digital = " + gameDigital.getPrecoFormatado());
		
		System.out.println();
		System.out.println("aplicando desconto......");
		System.out.println();
		
		livroImpresso.aplicaDesconto();
		revistaImpressa.aplicaDesconto();
		livroDigital.aplicaDesconto();
		tabuleiro.aplicaDesconto();
		
		System.out.println("Livro Impresso = " + livroImpresso.getPrecoFormatado());
		System.out.println("Revista Impresso = " + revistaImpressa.getPrecoFormatado());
		System.out.println("Livro Digital = " + livroDigital.getPrecoFormatado());
		System.out.println("tabuleiro " + tabuleiro.getPrecoFormatado());
		System.out.println("Game Físico = " + gameFisico.getPrecoFormatado());
		System.out.println("Game Digital = " + gameDigital.getPrecoFormatado());
		
		
	}

}
