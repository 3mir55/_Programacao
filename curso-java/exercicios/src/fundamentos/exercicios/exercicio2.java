package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		
		final double FATOR = 9.0/5.0, AJUSTE = 32;
		double Celsius, Fahrenheit;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual a temperatura Celsius?");
		Celsius = teclado.nextDouble();
		
		Fahrenheit = (Celsius * FATOR) + AJUSTE;
		System.out.printf("A temperatura é %.2f °F.", Fahrenheit);
		
		teclado.close();
	}
}
