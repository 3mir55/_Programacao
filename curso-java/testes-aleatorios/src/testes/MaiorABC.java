package testes;

import java.util.Scanner;

public class MaiorABC {

	public static void main(String[] args) {
		
		int A, B, C, maiorAB, maior;

		Scanner teclado = new Scanner(System.in);
		String [] nums = teclado.nextLine().split(" ");
		A = Integer.parseInt(nums[0].toString());
		B = Integer.parseInt(nums[1].toString());
		C = Integer.parseInt(nums[2].toString());
		
		maiorAB = (A + B + Math.abs(A - B)) / 2;
		maior = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
		
		System.out.printf("%d eh o maior\n", maior);
		teclado.close();
	}
}
