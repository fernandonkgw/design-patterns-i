package br.com.fernandonkgw.designpatterns.state;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.fernandonkgw.designpatterns.Item;

public class Orcamento {

	protected double valor;
	private final List<Item> itens;
	private EstadoDeUmOrcamento estadoAtual;
	
	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<>();
		this.estadoAtual = new EmAprovacao();
	}
	
	public double getValor() {
		return valor;
	}
	
	public EstadoDeUmOrcamento getEstadoAtual() {
		return estadoAtual;
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
	
	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	void setEstadoAtual(EstadoDeUmOrcamento estadoAtual) {
		this.estadoAtual = estadoAtual;
	}
	
	public void aprova() {
		estadoAtual.aprova(this);
	}
	
	public void reprova() {
		estadoAtual.reprova(this);
	}
}
