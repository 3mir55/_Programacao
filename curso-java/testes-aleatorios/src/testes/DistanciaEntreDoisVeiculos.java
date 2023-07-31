package testes;

import java.util.Scanner;

public class DistanciaEntreDoisVeiculos {

	public static void main(String[] args) {
		
		int tempo, distanciaXY;
		
		Scanner teclado = new Scanner(System.in);
		distanciaXY = teclado.nextInt();
		tempo = distanciaXY * 2;
		System.out.printf("%d minutos", tempo);
		teclado.close();
	}
}
