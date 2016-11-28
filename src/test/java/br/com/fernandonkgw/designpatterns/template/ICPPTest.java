package br.com.fernandonkgw.designpatterns.template;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

import br.com.fernandonkgw.designpatterns.state.Orcamento;
import br.com.fernandonkgw.designpatterns.template.ICPP;
import br.com.fernandonkgw.designpatterns.template.TemplateDeImpostoCondicional;

public class ICPPTest {
	
	private TemplateDeImpostoCondicional icpp;
	
	@Before
	public void criaImposto() {
		icpp = new ICPP();
	}

	@Test
	public void deveCalcularImpostoParaOrcamentoMenorQue500Reais() {
		
		Orcamento orcamento = new Orcamento(100.0);
		
		double imposto = icpp.calcula(orcamento);
		
		assertThat(imposto, equalTo(5.0));
	}

	@Test
	public void deveCalcularImpostoParaOrcamentoMaiorQue500Reais() {
	
		Orcamento orcamento = new Orcamento(1000.0);
		
		double imposto = icpp.calcula(orcamento);
		
		assertThat(imposto, equalTo(70.0));
	}
	
	@Test
	public void deveCalcularImpostoParaOrcamentoIgualA500Reais() {
		
		Orcamento orcamento = new Orcamento(500.0);
		
		double valorDoImposto = icpp.calcula(orcamento);
		
		assertThat(valorDoImposto, equalTo(25.0));
	}
}
