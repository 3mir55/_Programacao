package testes;

import java.util.Scanner;

public class DistanciaEntreDoisPontos {

	public static void main(String[] args) {
		
		double x1, y1, x2, y2, distancia;
		Scanner teclado = new Scanner(System.in);
		String [] x1y1 = teclado.nextLine().split(" ");
		String [] x2y2 = teclado.nextLine().split(" ");
		x1 = Double.parseDouble(x1y1[0].toString());
		y1 = Double.parseDouble(x1y1[1].toString());
		x2 = Double.parseDouble(x2y2[0].toString());
		y2 = Double.parseDouble(x2y2[1].toString());
		distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.printf("%.4f\n", distancia);
		teclado.close();
	}
}
