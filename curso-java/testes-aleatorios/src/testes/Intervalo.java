package testes;

import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		
		double numero;
		Scanner teclado = new Scanner(System.in);
		numero = teclado.nextDouble();
		if(numero >=0 && numero <= 25) {
			System.out.print("Intervalo [0,25]\n");
		} else if (numero > 25 && numero <= 50) {
			System.out.print("Intervalo (25,50]\n");			
		} else if (numero > 50 && numero <= 75) {
			System.out.print("Intervalo (50,75]\n");						
		} else if (numero > 75 && numero <= 100) {
			System.out.print("Intervalo (75,100]\n");						
		} else {
			System.out.print("Fora de intervalo\n");
		}
		teclado.close();
	}
}
