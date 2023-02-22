package br.com.gen.codigos.professorLuis;

import java.text.NumberFormat;

public class Empregado {
	private String nome;
	private double salario;
	
	
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
}
