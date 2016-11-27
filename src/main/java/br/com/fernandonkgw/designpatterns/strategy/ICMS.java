package br.com.fernandonkgw.designpatterns.strategy;

import br.com.fernandonkgw.designpatterns.Orcamento;
import br.com.fernandonkgw.designpatterns.decorator.Imposto;

public class ICMS extends Imposto {

	public ICMS() {}
	
	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + super.calculoDoOutroImposto(orcamento);
	}

	
}
