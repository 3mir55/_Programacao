package testes;

import java.util.Scanner;

public class ConversaoDeTempo {

	public static void main(String[] args) {

		int N, horas = 0, minutos = 0, segundos = 0;
		Scanner teclado = new Scanner(System.in);
		N = teclado.nextInt();

		if ((N / 3600) > 0) {
			horas = N / 3600;
			N = N % 3600;
		}
		if (N / 60 > 0) {
			minutos = N / 60;
			N = N % 60;
		}
		if (N > 0) {
			segundos = N;
		}
		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
		teclado.close();
	}
}
