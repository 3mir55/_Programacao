package Controle.Exercicios;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {

		int numero = 0, primo = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número inteiro: ");
		numero = teclado.nextInt();
		teclado.close();

		for (int cont = numero - 1; cont > 1; cont--) {
			if (numero % cont == 0) {
				primo = 1;
			}
		}
		switch (primo) {
		case 0:
			System.out.printf("O número %d é primo.\n", numero);
			break;
		case 1:
			System.out.printf("O número %d não é primo.\n", numero);
			break;
		}
		System.out.println("Fim!");
	}
}
