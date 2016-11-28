package br.com.fernandonkgw.designpatterns.state;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class OrcamentoTest {

	@Test
	public void deveCalcularDescontoParaOrcamentoEmAprovacao() {
		
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.aplicaDescontoExtra();
		
		assertThat(orcamento.getValor(), equalTo(475.0));
	}

	@Test
	public void deveCalcularDescontosParaOrcamentoEmAprovacaoEAprovado() {
		
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.aplicaDescontoExtra();
		
		orcamento.aprova();
		orcamento.aplicaDescontoExtra();
		
		assertThat(orcamento.getValor(), equalTo(465.5));
	}
}
