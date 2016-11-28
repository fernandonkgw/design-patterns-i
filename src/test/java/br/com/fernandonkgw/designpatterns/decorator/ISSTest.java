package br.com.fernandonkgw.designpatterns.decorator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import br.com.fernandonkgw.designpatterns.decorator.ISS;
import br.com.fernandonkgw.designpatterns.decorator.Imposto;
import br.com.fernandonkgw.designpatterns.state.Orcamento;
import br.com.fernandonkgw.designpatterns.strategy.ICMS;

public class ISSTest {

	@Test
	public void deveCalcularImpostoCompostoComICMS() {
		Imposto iss = new ISS(new ICMS());
		
		Orcamento orcamento = new Orcamento(500);
		
		double valor = iss.calcula(orcamento);
		
		assertThat(valor, equalTo(80.0));
	}

}
