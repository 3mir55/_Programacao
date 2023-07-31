package testes;

import java.util.Scanner;

public class ConsumoCombustível {

	public static void main(String[] args) {
		
		int X;
		double Y, consumoMedio;
		Scanner teclado = new Scanner(System.in);
		X = teclado.nextInt();
		Y = teclado.nextDouble();
		consumoMedio = X / Y;
		System.out.printf("%.3f km/l\n", consumoMedio);
		
		teclado.close();
	}
}
