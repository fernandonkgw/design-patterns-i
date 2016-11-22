package br.com.fernandonkgw.designpatterns.template;

import br.com.fernandonkgw.designpatterns.Orcamento;


public class ICPP extends TemplateDeImpostoCondicional {

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500.0;
	}

	
}