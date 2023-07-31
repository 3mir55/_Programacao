package testes;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {

		double A = 0.0, B = 0.0, C = 0.0, delta = 0, primeiraRaiz = 0.0, segundaRaiz = 0.0;
		Scanner teclado = new Scanner(System.in);
		String[] nums = teclado.nextLine().split(" ");

		A = Double.parseDouble(nums[0].toString());
		B = Double.parseDouble(nums[1].toString());
		C = Double.parseDouble(nums[2].toString());

		delta = Math.pow(B, 2) - 4 * A * C;
		if (delta > 0 && A != 0) {
			primeiraRaiz = (-B + Math.sqrt(delta)) / (2 * A);
			System.out.printf("R1 = %.5f\n", primeiraRaiz);
			segundaRaiz = (-B - Math.sqrt(delta)) / (2 * A);
			System.out.printf("R2 = %.5f\n", segundaRaiz);
		} else {
			System.out.print("Impossivel calcular\n");
		}

		teclado.close();
	}
}
