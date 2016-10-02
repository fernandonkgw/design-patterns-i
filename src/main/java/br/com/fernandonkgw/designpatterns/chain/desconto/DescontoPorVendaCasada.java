package br.com.fernandonkgw.designpatterns.chain.desconto;

import br.com.fernandonkgw.designpatterns.Orcamento;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if (aconteceuVendaCasadaEm(orcamento))
			return orcamento.getValor() * 0.05;
		else
			return proximo.desconta(orcamento);
	}

	private boolean aconteceuVendaCasadaEm(Orcamento orcamento) {
		return orcamento.existe("CANETA") && orcamento.existe("LAPIS");
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
