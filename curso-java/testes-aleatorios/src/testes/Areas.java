package testes;

import java.util.Scanner;

public class Areas {

	public static void main(String[] args) {
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo, PI = 3.14159;
		String stringA, stringB, stringC;
		Scanner teclado = new Scanner(System.in);
		String [] entrada = teclado.nextLine().split(" ");
		stringA = entrada[0];
		A = Double.parseDouble(stringA);
		stringB = entrada[1];
		B = Double.parseDouble(stringB);
		stringC = entrada[2];
		C = Double.parseDouble(stringC);
		
		triangulo = (A * C) / 2;
		circulo = PI * Math.pow(C, 2);
		trapezio = ((A + B) * C)/2;
		quadrado = Math.pow(B, 2);
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("RETANGULO: %.3f\n", retangulo);
		
		teclado.close();
	}
}
