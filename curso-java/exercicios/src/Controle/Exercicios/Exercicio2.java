package Controle.Exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o ano: ");
		int ano = 0;
		ano = teclado.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0) {
			System.out.printf("O ano %d é Bissexto.\n", ano);
		} else if (ano % 100 == 0 && ano % 400 == 0) {
				System.out.printf("O ano %d é Bissexto.\n", ano);
		} else {
			System.out.printf("O ano %d não é Bissexto.\n", ano);
		}
		System.out.println("Fim!");
		teclado.close();
	}
}
