package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("O trabalho 1 deu certo? S ou N\n");
		String trabalho1 = teclado.nextLine();
		trabalho1 = trabalho1.replace("S", "true");
		trabalho1 = trabalho1.replace("N", "false");
		
		System.out.print("O trabalho 2 deu certo? S ou N\n");
		String trabalho2 = teclado.nextLine();
		trabalho2 = trabalho2.replace("S", "true");
		trabalho2 = trabalho2.replace("N", "false");
		
		boolean tv55 = trabalho1.contains("true") && trabalho2.contains("true"); 
		boolean tv32 = trabalho1.contains("true") ^ trabalho2.contains("true");
		boolean sorvete =  trabalho1.contains("true") || trabalho2.contains("true");
		boolean emCasa = !sorvete;
		
		System.out.println("\n TV 55 " + tv55 + "\n TV 32 " + tv32 + "\n Sorvete "+ sorvete + "\n Ficar em casa " + emCasa);
		
		teclado.close();
	}

}
