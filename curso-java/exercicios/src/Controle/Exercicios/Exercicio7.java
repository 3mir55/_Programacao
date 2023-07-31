package Controle.Exercicios;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double numeroDigitado = 0, soma = 0;
		while(numeroDigitado >= 0) {
			System.out.print("Digite um número: ");
			numeroDigitado = teclado.nextDouble();
			if (numeroDigitado >= 0) {
				soma += numeroDigitado;
				System.out.println("A Soma é: " + soma);
			}
		}
		System.out.println("Fim!");
		teclado.close();
	}
}
