package br.com.fernandonkgw.designpatterns.strategy;

import br.com.fernandonkgw.designpatterns.Orcamento;
import br.com.fernandonkgw.designpatterns.decorator.Imposto;

public class CalculadorDeImpostos {

	public double realizaCalculo(Orcamento orcamento, Imposto imposto) {
		
		return imposto.calcula(orcamento);
	}
}
