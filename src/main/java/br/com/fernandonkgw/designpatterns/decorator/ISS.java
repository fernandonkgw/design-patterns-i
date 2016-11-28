package br.com.fernandonkgw.designpatterns.decorator;

import br.com.fernandonkgw.designpatterns.state.Orcamento;

public class ISS extends Imposto {

	public ISS() {
	}
	
	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + super.calculoDoOutroImposto(orcamento);
	}
}
