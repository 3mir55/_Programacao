package testes;

import java.io.IOException;
import java.util.Scanner;

public class MediaTresPesos {

	public static void main(String[] args) throws IOException {
		double A;
		double B;
		double C;
		
		double media;
		Scanner teclado = new Scanner(System.in);
		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();
		media = ((A / 10.0) * 2.0) + ((B / 10.0) * 3.0) + ((C / 10.0) * 5.0);
		System.out.printf("MEDIA = %.1f\n", media);
		teclado.close();
	}

}
