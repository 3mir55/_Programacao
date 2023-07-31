package testes;

import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {
		
		int montante, contador100 = 0, contador50 = 0, contador20 = 0;
		int contador10 = 0, contador5 = 0, contador2 = 0, contador1 = 0;
		Scanner teclado = new Scanner(System.in);
		montante = teclado.nextInt();
		
		System.out.printf("%d\n", montante);
		while(montante >= 100) {
			contador100++;
			montante = montante - 100;
		}
		System.out.printf("%d nota(s) de R$ 100,00\n", contador100);

		while(montante >= 50) {
			contador50++;
			montante = montante - 50;
		}
		System.out.printf("%d nota(s) de R$ 50,00\n", contador50);
		
		while(montante >= 20) {
			contador20++;
			montante = montante - 20;
		}
		System.out.printf("%d nota(s) de R$ 20,00\n", contador20);
		
		while(montante >= 10) {
			contador10++;
			montante = montante - 10;
		}
		System.out.printf("%d nota(s) de R$ 10,00\n", contador10);

		while(montante >= 5) {
			contador5++;
			montante = montante - 5;
		}
		System.out.printf("%d nota(s) de R$ 5,00\n", contador5);
		
		while(montante >= 2) {
			contador2++;
			montante = montante - 2;
		}
		System.out.printf("%d nota(s) de R$ 2,00\n", contador2);
		
		while(montante >= 1) {
			contador1++;
			montante = montante - 1;
		}
		System.out.printf("%d nota(s) de R$ 1,00\n", contador1);
		teclado.close();
	}
}
