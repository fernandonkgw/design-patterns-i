package br.com.fernandonkgw.designpatterns;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fernandonkgw.designpatterns.observer.AcaoAposGerarNota;

public class NotaFiscalBuilder {

	private String razaoSocial;
	private String cnpj;
	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	private double valorBruto = 0;
	private double impostos = 0;
	private String observacoes;
	private Calendar data;
	
	private List<AcaoAposGerarNota> todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNota>();
	
	public NotaFiscalBuilder() {
		this.data = Calendar.getInstance();
	}

	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder com(ItemDaNota itemNovo) {
		todosItens.add(itemNovo);
		valorBruto += itemNovo.getValor();
		impostos += itemNovo.getValor() * 0.05;
		return this;
	}
	
	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	
	public NotaFiscalBuilder naData(Calendar data) {
		this.data = data;
		return this;
	}
	
	public NotaFiscal constroi() {
		NotaFiscal notaFiscal = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);
		
		for (AcaoAposGerarNota acaoAposGerarNota : todasAcoesASeremExecutadas) {
			acaoAposGerarNota.executa(notaFiscal);
		}
		
		return notaFiscal;
	}
	
	public void adiciona(AcaoAposGerarNota acao) {
		todasAcoesASeremExecutadas.add(acao);
	}
}
