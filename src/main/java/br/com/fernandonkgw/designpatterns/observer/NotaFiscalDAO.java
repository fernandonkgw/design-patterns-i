package br.com.fernandonkgw.designpatterns.observer;

import br.com.fernandonkgw.designpatterns.NotaFiscal;

public class NotaFiscalDAO implements AcaoAposGerarNota {

	@Override
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("salvando no banco");
	}

}
