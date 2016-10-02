package br.com.fernandonkgw.designpatterns.chain.resposta;

public class RespostaEmPorcento implements Resposta {

	private Resposta outraResposta;

	public RespostaEmPorcento(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}
	
	public RespostaEmPorcento() {
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (Formato.PORCENTO.equals(req.getFormato()))
			System.out.println(conta.getTitular()+"%"+conta.getSaldo());
		else if (outraResposta != null)
			outraResposta.responde(req, conta);
		else
			throw new RuntimeException("Formato de resposta não encontrado!");
	}
}
