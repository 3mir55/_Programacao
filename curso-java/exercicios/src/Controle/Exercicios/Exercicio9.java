package Controle.Exercicios;

import java.util.Scanner;

public class Exercicio9 {
	
	public static void main(String[] args) {
		
		double numeroDigitado = 0, numero = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			numeroDigitado = teclado.nextDouble();
			if (numeroDigitado > numero) {
				numero = numeroDigitado;
			}
		}
		System.out.println("O maior número é: " + numero);
		
		teclado.close();
	}
}
