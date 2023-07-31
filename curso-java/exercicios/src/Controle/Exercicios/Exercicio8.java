package Controle.Exercicios;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite uma palavra: ");
		String palavra = teclado.nextLine();
		int tamanho = palavra.length();
		for (int i = 0; i < tamanho; i++ ) {
			System.out.printf("%c ", palavra.charAt(i));
		}
		teclado.close();
	}
}
