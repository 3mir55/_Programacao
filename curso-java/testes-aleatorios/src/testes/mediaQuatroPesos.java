package testes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class mediaQuatroPesos {

	public static void main(String[] args) {

		double N1 = 0, N2 = 0, N3 = 0, N4 = 0, exame = 0, media = 0, mediaE = 0;

		Scanner teclado = new Scanner(System.in);
		String[] notas = teclado.nextLine().split(" ");
		N1 = Double.parseDouble(notas[0]);
		N2 = Double.parseDouble(notas[1]);
		N3 = Double.parseDouble(notas[2]);
		N4 = Double.parseDouble(notas[3]);

		media = (N1 * 0.2) + (N2 * 0.3) + (N3 * 0.4) + (N4 * 0.1);
		
//		DecimalFormat df = new DecimalFormat("#,##0.0");
//		BigDecimal bd = new BigDecimal(media).setScale(1, RoundingMode.HALF_DOWN);
//		df.setRoundingMode(RoundingMode.DOWN);

		double bd = new BigDecimal(media).setScale(1, RoundingMode.HALF_DOWN).doubleValue();
	    StringBuilder sb = new StringBuilder(String.valueOf(bd));
	    media = Double.valueOf(sb.deleteCharAt(sb.length() - 1).toString());
//		System.out.println(media);
//		System.out.println(df.format(media));

//		System.out.println(df.format(media));

		if (media >= 5.0 && media <= 6.9) {
			exame = teclado.nextDouble();
			mediaE = (media + exame) / 2.0;
			System.out.print("Media: "+ media + "\n");
			System.out.print("Aluno em exame.\n");
			System.out.printf("Nota do exame: %.1f\n", exame);
			if (mediaE >= 5.0) {
				System.out.print("Aluno aprovado.\n");
			} else {
				System.out.print("Aluno reprovado.\n");
			}
			System.out.printf("Media final: %.1f\n", mediaE);
		} else if (media >= 7.0) {
			System.out.printf("Media: %.1f\n", media);
			System.out.print("Aluno aprovado.\n");
		} else if (media < 5.0) {
			System.out.printf("Media: %.1f\n", media);
			System.out.print("Aluno reprovado.\n");
		}
		teclado.close();
	}
//	public static double roundHalfDown(double d) {
//	    double bd = new BigDecimal(d).setScale(2, RoundingMode.DOWN).doubleValue();
//
//	    StringBuilder sb = new StringBuilder(String.valueOf(bd));
//	    return Double.valueOf(sb.deleteCharAt(sb.length() - 1).toString());
//	  }
}
