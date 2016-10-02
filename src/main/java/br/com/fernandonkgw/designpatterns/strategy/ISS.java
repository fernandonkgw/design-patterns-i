package br.com.fernandonkgw.designpatterns.strategy;

import br.com.fernandonkgw.designpatterns.Orcamento;

public class ISS implements Imposto {

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}
