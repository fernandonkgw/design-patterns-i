package br.com.fernandonkgw.investimento;

import java.util.ArrayList;
import java.util.List;

public class FiltroMaiorQue500MilReais extends Filtro {

	@Override
	protected List<Conta> filtra(List<Conta> contas) {

		List<Conta> filtrada = new ArrayList<Conta>();
		for (Conta conta : contas) {
			if (conta.getSaldo() > 500000.0)
				filtrada.add(conta);
		}
		
		filtrada.addAll(super.proximo(contas));
		return filtrada;
	}

}
