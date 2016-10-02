package br.com.fernandonkgw.designpatterns.chain;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import br.com.fernandonkgw.designpatterns.Item;
import br.com.fernandonkgw.designpatterns.Orcamento;
import br.com.fernandonkgw.designpatterns.chain.desconto.Desconto;
import br.com.fernandonkgw.designpatterns.chain.desconto.DescontoPorCincoItens;
import br.com.fernandonkgw.designpatterns.chain.desconto.DescontoPorMaisDeQuinhentosReais;
import br.com.fernandonkgw.designpatterns.chain.desconto.DescontoPorVendaCasada;
import br.com.fernandonkgw.designpatterns.chain.desconto.SemDesconto;

public class DescontoPorVendaCasadaTest {

	@Test
	public void deveCalcularDescontoDeVendaCasada() {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto d4 = new SemDesconto();

		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);

		Item lapis = new Item("LAPIS", 15.0);
		Item caneta = new Item("CANETA", 15.0);
		Item borracha = new Item("borracha", 15.0);

		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adiciona(lapis);
		orcamento.adiciona(caneta);
		orcamento.adiciona(borracha);

		double desconto = d1.desconta(orcamento);
		assertThat(desconto, equalTo(25.0));
	}
}
