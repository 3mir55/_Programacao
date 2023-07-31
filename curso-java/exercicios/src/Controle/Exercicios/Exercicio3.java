package Controle.Exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double nota = 0, media = 0, somatoria = 0;
		
		int contador = 1;
		
		while (contador <= 2) {
			System.out.printf("Digite a %dª nota: ", contador);
			nota = teclado.nextDouble();
			if(nota <= 10 && nota >=0) {
				somatoria += nota;
				contador++;
			} else {
				System.out.println("Nota inválida!");
			}
		}
		
		media = somatoria / (contador - 1);
		System.out.printf("A média é: %.1f\n", media);
		if (media >= 7) {
			System.out.println("Aprovado!");
		} else if (media >=4) {
			System.out.println("Em recuperação!");
		} else {
			System.out.println("Reprovado!");			
		}
		teclado.close();
	}
}
