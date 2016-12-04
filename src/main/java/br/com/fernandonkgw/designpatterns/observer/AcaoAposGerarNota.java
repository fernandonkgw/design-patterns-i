package br.com.fernandonkgw.designpatterns.observer;

import br.com.fernandonkgw.designpatterns.NotaFiscal;

public interface AcaoAposGerarNota {
	void executa(NotaFiscal notaFiscal);
}
