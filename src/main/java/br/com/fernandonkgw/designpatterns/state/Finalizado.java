package br.com.fernandonkgw.designpatterns.state;

class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new IllegalStateException("Orçamentos finalizados não recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new IllegalStateException("Não posso mudar mais, já esta finalizado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new IllegalStateException("Não posso mudar mais, já esta finalizado!");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new IllegalStateException("Não posso mudar mais, já esá finalizado!");
	}

}
