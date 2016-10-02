package br.com.fernandonkgw.designpatterns.strategy;

import br.com.fernandonkgw.designpatterns.Orcamento;

public interface Imposto {

	double calcula(Orcamento orcamento);
}
