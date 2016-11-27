package br.com.fernandonkgw.designpatterns.decorator;

import br.com.fernandonkgw.designpatterns.Orcamento;

public abstract class Imposto {

	private final Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	public Imposto() {
		this.outroImposto = null;
	}

	public abstract double calcula(Orcamento orcamento);

	protected double calculoDoOutroImposto(Orcamento orcamento) {
		// tratando o caso do próximo imposto nao existr
		if (outroImposto == null)
			return 0;
		return outroImposto.calcula(orcamento);
	}
}
