package br.com.fernandonkgw.investimento;

import java.util.Calendar;

public class Conta {

	protected double saldo;
	private Calendar dataAbertura;
	protected EstadoDaConta estado;
	
	public Conta() {
		estado = new Positivo();
	}

	public void saca(double valor) {
		estado.saca(this, valor);
	}
	
	public void deposita(double valor) {
		estado.deposita(this, valor);
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public Calendar getDataAbertura() {
		return dataAbertura;
	}
}
