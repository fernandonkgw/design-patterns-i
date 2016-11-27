package br.com.fernandonkgw.designpatterns.template;

import br.com.fernandonkgw.designpatterns.Orcamento;
import br.com.fernandonkgw.designpatterns.decorator.Imposto;

public abstract class TemplateDeImpostoCondicional extends Imposto {

	@Override
	public final double calcula(Orcamento orcamento) {
		
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) + super.calculoDoOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento) + super.calculoDoOutroImposto(orcamento);
		}
	}

	protected abstract double minimaTaxacao(Orcamento orcamento);

	protected abstract double maximaTaxacao(Orcamento orcamento);

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
