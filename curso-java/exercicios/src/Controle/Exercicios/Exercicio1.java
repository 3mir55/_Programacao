package Controle.Exercicios;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = teclado.nextInt();
		if (numero <= 10 && numero >=0) {
			int par = numero % 2;
			if (par == 0) {
				System.out.printf("O numero %d é par.\n", numero);
			}
		} else {
			System.out.println("O número digitado é inválido");
		}
		System.out.println("Fim!");
		teclado.close();
	}
}
