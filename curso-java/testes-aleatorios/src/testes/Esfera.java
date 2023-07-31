package testes;

import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {
		
		double R, PI, volume;
		PI = 3.14159;
		Scanner teclado = new Scanner(System.in);
		R = teclado.nextDouble();
		volume = (4.0 / 3.0) * PI * Math.pow(R, 3);
		System.out.printf("VOLUME = %.3f\n", volume);
		
		teclado.close();
	}
}
