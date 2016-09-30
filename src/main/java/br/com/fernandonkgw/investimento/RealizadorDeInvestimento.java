package br.com.fernandonkgw.investimento;

public class RealizadorDeInvestimento {

	public void realiza(Investimento investimento, Conta conta) {
		
		double resultado = investimento.calcula(conta);
		
		conta.deposita(resultado * 0.75);
		System.out.println("Novo saldo: " + conta.getSaldo());
	}
}
