package br.com.fernandonkgw.designpatterns.chain.resposta;

public class RespostaEmCsv implements Resposta {

	private Resposta outraResposta;

	public RespostaEmCsv(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (Formato.CSV.equals(req.getFormato()))
			System.out.println(conta.getTitular()+","+conta.getSaldo());
		else
			outraResposta.responde(req, conta);
	}

}
