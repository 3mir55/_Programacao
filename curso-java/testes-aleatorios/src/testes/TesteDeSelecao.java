package testes;

import java.util.Scanner;

public class TesteDeSelecao {

	public static void main(String[] args) {
		
		int A, B, C, D;
		Scanner teclado = new Scanner(System.in);
		String [] nums = teclado.nextLine().split(" ");
		
		A = Integer.parseInt(nums[0].toString());
		B = Integer.parseInt(nums[1].toString());
		C = Integer.parseInt(nums[2].toString());
		D = Integer.parseInt(nums[3].toString());
		
		if(B > C && D > A && C + D > A + B && C >= 0 && D >= 0 && A%2 == 0) {
			System.out.print("Valores aceitos\n");
		} else {
			System.out.print("Valores nao aceitos\n");
		}
		teclado.close();
	}
}
