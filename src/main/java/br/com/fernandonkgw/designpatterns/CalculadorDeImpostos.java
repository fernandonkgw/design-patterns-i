package br.com.fernandonkgw.designpatterns;

public class CalculadorDeImpostos {

	public double realizaCalculo(Orcamento orcamento, Imposto imposto) {
		
		return imposto.calcula(orcamento);
	}
}
