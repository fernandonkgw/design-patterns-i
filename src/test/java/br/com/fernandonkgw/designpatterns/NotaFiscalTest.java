package br.com.fernandonkgw.designpatterns;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class NotaFiscalTest {

	@Test
	public void deveCalcularValorBrutoDaNotaFiscal() {
		
		NotaFiscalBuilder builder = new NotaFiscalBuilder();
		builder.paraEmpresa("Caelum Ensino e Inovação")
		.comCnpj("12.345.6789-10")
		.com(new ItemDaNota("item 1", 200.0))
		.com(new ItemDaNota("item 2", 300.0))
		.com(new ItemDaNota("item 3", 400.0))
		.comObservacoes("observacoes"); // interface fluente, técnica method chaining
		
		NotaFiscal nf = builder.constroi();
		
		assertThat(nf.getValorBruto(), equalTo(900.0));
	}

}
