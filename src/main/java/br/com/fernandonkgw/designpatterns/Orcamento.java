package br.com.fernandonkgw.designpatterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private final double valor;
	private final List<Item> itens;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<>();
	}
	
	public double getValor() {
		return valor;
	}
	
	public void adiciona(Item item) {
		itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public boolean existe(String nomeDoItem) {
		for (Item item : itens) {
			if (item.getNome().equals(nomeDoItem))
				return true;
		}
		return false;
	}
}
