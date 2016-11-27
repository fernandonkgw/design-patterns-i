package br.com.fernandonkgw.investimento;

import java.util.ArrayList;
import java.util.List;

public class FiltroMenorQue100Reais extends Filtro {

	@Override
	protected List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		for (Conta conta : contas) {
			if (conta.getSaldo() < 100)
				filtrada.add(conta);
		}
		
		filtrada.addAll(proximo(contas));
		return filtrada;
	}

}
