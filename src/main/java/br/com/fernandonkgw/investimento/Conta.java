package br.com.fernandonkgw.investimento;

import java.util.Calendar;

public class Conta {

	private double saldo;
	private Calendar dataAbertura;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public Calendar getDataAbertura() {
		return dataAbertura;
	}
}
