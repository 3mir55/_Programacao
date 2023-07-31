package testes;

import java.util.Scanner;

public class NotasEMoedas {

	public static void main(String[] args) {

		double montante = 0.00;
		int notasDe100 = 0, notasDe50 = 0, notasDe20 = 0, notasDe10 = 0, notasDe5 = 0, notasDe2 = 0;
		int moedasde1R = 0, moedas50c = 0, moedas25c = 0, moedas10c = 0, moedas5c = 0, moedas1c = 0;

		Scanner teclado = new Scanner(System.in);
		montante = teclado.nextDouble();
		System.out.print("NOTAS:\n");
		while (montante >= 100.00) {
			notasDe100++;
			montante = montante - 100.00;
		}
		System.out.printf("%d nota(s) de R$ 100.00\n", notasDe100);
		while (montante >= 50.00) {
			notasDe50++;
			montante = montante - 50.00;
		}
		System.out.printf("%d nota(s) de R$ 50.00\n", notasDe50);
		while (montante >= 20.00) {
			notasDe20++;
			montante = montante - 20.00;
		}
		System.out.printf("%d nota(s) de R$ 20.00\n", notasDe20);
		while (montante >= 10.00) {
			notasDe10++;
			montante = montante - 10.00;
		}
		System.out.printf("%d nota(s) de R$ 10.00\n", notasDe10);
		while (montante >= 5.00) {
			notasDe5++;
			montante = montante - 5.00;
		}
		System.out.printf("%d nota(s) de R$ 5.00\n", notasDe5);
		while (montante >= 2.00) {
			notasDe2++;
			montante = montante - 2.00;
		}
		System.out.printf("%d nota(s) de R$ 2.00\n", notasDe2);

		System.out.print("MOEDAS:\n");
		while (montante >= 1.00) {
			moedasde1R++;
			montante = montante - 1.00;
		}
		System.out.printf("%d moeda(s) de R$ 1.00\n", moedasde1R);
		while (montante >= 0.50) {
			moedas50c++;
			montante = montante - 0.50;
		}
		System.out.printf("%d moeda(s) de R$ 0.50\n", moedas50c);
		while (montante >= 0.25) {
			moedas25c++;
			montante = montante - 0.25;
		}
		System.out.printf("%d moeda(s) de R$ 0.25\n", moedas25c);
		while (montante >= 0.10) {
			moedas10c++;
			montante = montante - 0.10;
		}
		System.out.printf("%d moeda(s) de R$ 0.10\n", moedas10c);
		while (montante >= 0.05) {
			moedas5c++;
			montante = montante - 0.05;
		}
		System.out.printf("%d moeda(s) de R$ 0.05\n", moedas5c);
		System.out.println(montante);
		if(montante > 0.001 && montante < 0.010) {
			montante = 0.01;
		}
		while (montante >= 0.01) {
			moedas1c++;
			montante = montante - 0.01;
			if(montante > 0.001 && montante < 0.010) {
				montante = 0.01;
			}
		}
		System.out.printf("%d moeda(s) de R$ 0.01\n", moedas1c);

		teclado.close();
	}
}
