package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		
		final double AJUSTE = 32, FATOR = 5.0/9.0; //valores constantes (final)
		double Celsius, Fahrenheit;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual a temperatura Fahrenheit? ");
		Fahrenheit = teclado.nextDouble();
		
		Celsius = (Fahrenheit - AJUSTE) * FATOR;
		System.out.printf("A temperatura é %.2f °C.", Celsius);
				
		teclado.close();
	}

}
