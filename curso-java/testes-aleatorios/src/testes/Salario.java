package testes;

import java.io.IOException;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) throws IOException {

		int A;
		int B;
		double C;
		double salario;
		Scanner teclado = new Scanner(System.in);
		A = teclado.nextInt();
		B = teclado.nextInt();
		C = teclado.nextDouble();
		salario = B * C;
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", A, salario);
		teclado.close();
	}
}
