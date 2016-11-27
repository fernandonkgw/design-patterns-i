package br.com.fernandonkgw.designpatterns.strategy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import br.com.fernandonkgw.designpatterns.Orcamento;
import br.com.fernandonkgw.designpatterns.decorator.ISS;
import br.com.fernandonkgw.designpatterns.strategy.CalculadorDeImpostos;
import br.com.fernandonkgw.designpatterns.strategy.ICMS;

public class CalculadorDeImpostosTest {

	@Test
	public void deveCalcularICMS() {
		Orcamento orcamento = new Orcamento(100);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		double icms = calculador.realizaCalculo(orcamento, new ICMS());
		
		double icmsEsperado = 10;
		
		assertThat(icms, equalTo(icmsEsperado));
	}
	
	@Test
	public void deveCalcularISS() {
		Orcamento orcamento = new Orcamento(100);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		double iss = calculador.realizaCalculo(orcamento, new ISS());
		
		double issEsperado = 6;
		
		assertThat(iss, equalTo(issEsperado));
	}
}
