package testes;

import java.util.Scanner;

public class GastoDeCombustivel {

	public static void main(String[] args) {
		
		final int rendimento = 12;
		int tempoGasto, velocidadeMedia;
		Double combustivelGasto;
		Scanner teclado = new Scanner(System.in);
		tempoGasto = teclado.nextInt();
		velocidadeMedia = teclado.nextInt();
		
		combustivelGasto = (double)(tempoGasto * velocidadeMedia) / rendimento;
		System.out.printf("%.3f\n", combustivelGasto);
		
		teclado.close();
	}
}
