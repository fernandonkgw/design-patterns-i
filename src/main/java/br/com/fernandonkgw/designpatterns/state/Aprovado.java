package br.com.fernandonkgw.designpatterns.state;

class Aprovado implements EstadoDeUmOrcamento {
	
	private boolean descontoAplicado = false;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.02;
			descontoAplicado = true;
		} else {
			throw new RuntimeException("Desconto já aplicado!");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		// já estou em aprovação
		throw new IllegalStateException("Orçamento já está em estado de aprovação");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		// não pode ser reprovado agora!
		throw new IllegalStateException("Orçamento está em estado de aprovação e não pode ser reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		// daqui posso ir para o estado finalizado
		orcamento.setEstadoAtual(new Finalizado());
	}
	
}
