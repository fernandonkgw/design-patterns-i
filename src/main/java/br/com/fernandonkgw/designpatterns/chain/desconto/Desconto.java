package br.com.fernandonkgw.designpatterns.chain.desconto;

import br.com.fernandonkgw.designpatterns.state.Orcamento;

public interface Desconto {

	double desconta(Orcamento orcamento);
	
	void setProximo(Desconto desconto);
}
