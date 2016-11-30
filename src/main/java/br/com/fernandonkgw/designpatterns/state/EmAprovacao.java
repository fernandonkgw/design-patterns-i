package br.com.fernandonkgw.designpatterns.state;


class EmAprovacao implements EstadoDeUmOrcamento {
	
	private boolean descontoAplicado = false;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.05;
			descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto já aplicado!");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		// desse estado posso ir para o estado de aprovado
		orcamento.setEstadoAtual(new Aprovado());
	}

	@Override
	public void reprova(Orcamento orcamento) {
		// desse estado posso ir para o estado de reprovado
		orcamento.setEstadoAtual(new Reprovado());
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		// daqui não posso ir direto para finalizado
		throw new RuntimeException("Orçamento em aprovação não podem ir para finalizado diretamente!");
	}

}
