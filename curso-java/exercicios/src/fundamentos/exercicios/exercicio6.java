package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		System.out.println("Considere a fórmula Ax² + Bx + C = 0");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual o valor de A ");
		double a = teclado.nextDouble();
		
		System.out.println("Qual o valor de B ");
		double b = teclado.nextDouble();
		
		System.out.println("Qual o valor de C ");
		double c = teclado.nextDouble();
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		double raiz1 = (-b + Math.sqrt(delta)) / 2 * a;
		double raiz2 = (-b - Math.sqrt(delta)) / 2 * a;
		System.out.printf("Sua equação é: %.1fx² + %.1fx + %.1f\n", a, b, c);
		System.out.printf("O valor de delta é: %.2f\n", delta);
		System.out.printf("O valor da primeira raiz x é: %.2f\n", raiz1);
		System.out.printf("O valor da segunda raiz x é: %.2f", raiz2);
				
		teclado.close();
	}
}
