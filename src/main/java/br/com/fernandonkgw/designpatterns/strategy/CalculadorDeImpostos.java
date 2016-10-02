package br.com.fernandonkgw.designpatterns.strategy;

import br.com.fernandonkgw.designpatterns.Orcamento;

public class CalculadorDeImpostos {

	public double realizaCalculo(Orcamento orcamento, Imposto imposto) {
		
		return imposto.calcula(orcamento);
	}
}
