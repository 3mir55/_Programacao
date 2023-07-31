package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual é a base do triângulo?");
		double base = teclado.nextDouble();
		
		System.out.println("Qual é a altura do triângulo?");
		double altura = teclado.nextDouble();
		
		double area = (base * altura) / 2;
		System.out.printf("A área do triângulo é: %.2f", area);
		
		teclado.close();
	}
}
