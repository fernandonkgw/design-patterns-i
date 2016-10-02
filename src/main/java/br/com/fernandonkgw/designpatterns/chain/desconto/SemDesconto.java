package br.com.fernandonkgw.designpatterns.chain.desconto;

import br.com.fernandonkgw.designpatterns.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
		
	}

}
