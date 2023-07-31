package Controle.Exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Random randomico = new Random();
		int aleatorio = randomico.nextInt(101);
		
		for (int i = 10; i > 0; i--) {
			System.out.print("Qual é o número? ");
			int chute = teclado.nextInt();
			if (chute == aleatorio) {
				System.out.println("Voce acertou!");
				break;
			} else if (chute > aleatorio) {
				System.out.printf("%d é maior\n", chute);
			} else if (chute < aleatorio) {
				System.out.printf("%d é menor\n", chute);							
			}
			System.out.printf("Restam %d tentativas!\n", i - 1);
		}
		teclado.close();
		System.out.println(aleatorio);
	}
}
