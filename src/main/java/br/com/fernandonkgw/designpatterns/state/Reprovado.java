package br.com.fernandonkgw.designpatterns.state;

class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new IllegalStateException("Orçamentos reprovados não recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new IllegalStateException("Orçamento está no estado de reprovação, não pode aprovar agora!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new IllegalStateException("Já está reprovado!");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.setEstadoAtual(new Finalizado());
	}

}
