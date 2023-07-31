package testes;

import java.util.Scanner;

public class testeMedia {

	public static void main(String[] args) {

		double N1 = 2, N2 = 6.5, N3 = 4, N4 = 9, exame = 0, media = 0, mediaE = 0;

		Scanner teclado = new Scanner(System.in);
		String[] notas = teclado.nextLine().split(" ");
		N1 = Double.parseDouble(notas[0]);
		N2 = Double.parseDouble(notas[1]);
		N3 = Double.parseDouble(notas[2]);
		N4 = Double.parseDouble(notas[3]);
		
		media = (N1 * 0.2) + (N2 * 0.3) + (N3 * 0.4) + (N4 * 0.1);

		double comparadorMaior = 0, comparadorMenor = 0, mod = 0;
		
		comparadorMaior = media - 0.04;
		comparadorMenor = media + 0.05;
		mod = media % (media);
		
		
		System.out.println(media);
		System.out.println(comparadorMaior);
		System.out.println(comparadorMenor);
		System.out.println("MOD " + mod);
		teclado.close();
	}
}
