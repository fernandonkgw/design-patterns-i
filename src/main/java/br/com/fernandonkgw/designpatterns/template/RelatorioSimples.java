package br.com.fernandonkgw.designpatterns.template;

import java.util.List;

import br.com.fernandonkgw.investimento.Conta;

public class RelatorioSimples extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco XYZ");
	}

	@Override
	protected void rodape() {
		System.out.println("(11)2222-3333");
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for(Conta conta : contas) {
			System.out.println(conta.getSaldo());
		}
	}

}
