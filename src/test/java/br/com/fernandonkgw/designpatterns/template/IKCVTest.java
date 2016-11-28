package br.com.fernandonkgw.designpatterns.template;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;

import br.com.fernandonkgw.designpatterns.Item;
import br.com.fernandonkgw.designpatterns.state.Orcamento;

public class IKCVTest {

	private TemplateDeImpostoCondicional ikcv;
	
	@Before
	public void criaImposto() {
		ikcv = new IKCV();
	}
	
	@Test
	public void deveCalcularImpostoParaOracamentoMenorQue500ReaisItemMenorQue100Reais() {
		
		Orcamento orcamento = new Orcamento(100);
		orcamento.adiciona(new Item("Caneta", 10.0));
		
		double imposto = ikcv.calcula(orcamento);
		
		assertThat(imposto, equalTo(6.0));
	}
	
	@Test
	public void deveCalcularImpostoParaOrcamentoMenorQue500ItemMaiorQue100Reais() {
		
		Orcamento orcamento = new Orcamento(200.0);
		orcamento.adiciona(new Item("Caneta", 200.0));
		
		double imposto = ikcv.calcula(orcamento);
		
		assertThat(imposto, equalTo(12.0));
	}
	
	@Test
	public void deveCalcularImpostoParaOrcamentoMaiorQue500ReaisItemMaiorQue100Reais() {
		
		Orcamento orcamento = new Orcamento(1000.0);
		orcamento.adiciona(new Item("Caneta", 200.0));
		
		double imposto = ikcv.calcula(orcamento);
		
		assertThat(imposto, equalTo(100.0));
	}
	
	@Test
	public void deveCalcularImpostoParaOrcamentoMaiorQue500ReaisItemMenorQue100Reais() {
		
		Orcamento orcamento = new Orcamento(1000.0);
		orcamento.adiciona(new Item("Caneta", 10.0));
		
		double valorDoImposto = ikcv.calcula(orcamento);
		
		assertThat(valorDoImposto, equalTo(60.0));
	}
	
	@Test
	public void deveCalcularImpostoParaOrcamentoIgualA500ReaisItemMaiorQue100Reais() {
		
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adiciona(new Item("Caneta", 200.0));
		
		double valorDoImposto = ikcv.calcula(orcamento);
		
		assertThat(valorDoImposto, equalTo(30.0));
	}
	
	@Test
	public void deveCalcularImpostoParaOrcamentoIgualA500ReaisItemMenorQue100Reais() {
		
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adiciona(new Item("Caneta", 90.0));
		
		double valorDoImposto = ikcv.calcula(orcamento);
		
		assertThat(valorDoImposto, equalTo(30.0));
	}
}
