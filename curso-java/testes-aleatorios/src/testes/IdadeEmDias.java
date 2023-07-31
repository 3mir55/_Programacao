package testes;

import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args) {
		
		int N, anos = 0, meses = 0, dias = 0;
		Scanner teclado = new Scanner(System.in);
		N = teclado.nextInt();

		if ((N / 365) > 0) {
			anos = N / 365;
			N = N % 365;
		}
		if (N / 30 > 0) {
			meses = N / 30;
			N = N % 30;
		}
		if (N > 0) {
			dias = N;
		}
		System.out.printf("%d ano(s)\n", anos);
		System.out.printf("%d mes(es)\n", meses);
		System.out.printf("%d dia(s)\n", dias);
		teclado.close();
	}
}
