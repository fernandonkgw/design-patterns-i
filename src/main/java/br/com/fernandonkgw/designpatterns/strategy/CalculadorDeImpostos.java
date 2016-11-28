package br.com.fernandonkgw.designpatterns.strategy;

import br.com.fernandonkgw.designpatterns.decorator.Imposto;
import br.com.fernandonkgw.designpatterns.state.Orcamento;

public class CalculadorDeImpostos {

	public double realizaCalculo(Orcamento orcamento, Imposto imposto) {
		
		return imposto.calcula(orcamento);
	}
}
