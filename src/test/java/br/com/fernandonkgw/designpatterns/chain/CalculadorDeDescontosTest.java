package br.com.fernandonkgw.designpatterns.chain;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import br.com.fernandonkgw.designpatterns.Item;
import br.com.fernandonkgw.designpatterns.Orcamento;
import br.com.fernandonkgw.designpatterns.chain.desconto.CalculadorDeDescontos;

public class CalculadorDeDescontosTest {

	@Test
	public void deveCalcularDescontoParaOrcamentoMaiorQue500Reais() {
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();

		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adiciona(new Item("Caneta", 250.0));
		orcamento.adiciona(new Item("Lapis", 250.0));

		double descontoFinal = descontos.calcula(orcamento);
		
		assertThat(descontoFinal, equalTo(42.00000000000001));
	}
}
