package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		double valor = teclado.nextDouble();
		
		double quadrado = Math.pow(valor, 2);
		double cubo = Math.pow(valor, 3);
		
		System.out.printf("O Quadrado é: %.2f e o Cubo é: %.2f", quadrado, cubo);
		
		teclado.close();
	}
}
