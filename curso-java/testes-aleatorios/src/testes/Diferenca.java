package testes;

import java.io.IOException;
import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) throws IOException {
		
		int A;
		int B;
		int C;
		int D;
		int diferenca;
		Scanner teclado = new Scanner(System.in);
		A = teclado.nextInt();
		B = teclado.nextInt();
		C = teclado.nextInt();
		D = teclado.nextInt();
		diferenca = (A * B)-(C * D);
		System.out.printf("DIFERENCA = %d\n", diferenca);
		teclado.close();
	}
}
