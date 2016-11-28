package br.com.fernandonkgw.designpatterns.state;

class Aprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.aplicaDesconto(0.02);
	}

	@Override
	public void aprova(Orcamento orcamento) {
		// já estou em aprovação
		throw new RuntimeException("Orçamento já está em estado de aprovação");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		// não pode ser reprovado agora!
		throw new RuntimeException("Orçamento está em estado de aprovação e não pode ser reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		// daqui posso ir para o estado finalizado
		orcamento.setEstadoAtual(new Finalizado());
	}
	
}
