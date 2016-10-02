package br.com.fernandonkgw.designpatterns.chain.resposta;

public class Requisicao {

	private Formato formato;
	
	public Requisicao(Formato formato) {
		this.formato = formato;
	}
	
	public Formato getFormato() {
		return formato;
	}
}
