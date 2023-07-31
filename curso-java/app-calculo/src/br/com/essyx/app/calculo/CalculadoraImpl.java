package br.com.essyx.app.calculo;

import br.com.essyx.app.Calculadora;
import br.com.essyx.app.calculo.interno.OperacoesAritmeticas;
import br.com.essyx.app.logging.Logger;

public class CalculadoraImpl implements Calculadora{

	private String id = "";
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}

	public String getId() {
		return id;
	}
}
