package br.com.fernandonkgw.designpatterns.observer;

import br.com.fernandonkgw.designpatterns.NotaFiscal;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("enviando por e-mail");
	}

}
