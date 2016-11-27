package br.com.fernandonkgw.investimento;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {

	private final Filtro outroFiltro;

	public Filtro() {
		this.outroFiltro = null;
	}

	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
	}

	protected abstract List<Conta> filtra(List<Conta> contas);

	protected List<Conta> proximo(List<Conta> contas) {
		if (outroFiltro != null)
			return outroFiltro.filtra(contas);
		else
			return new ArrayList<Conta>();
	}
}
