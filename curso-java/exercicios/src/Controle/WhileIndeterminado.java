package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		String palavra = "início";
		Scanner teclado = new Scanner(System.in);
		while(!"sair".equalsIgnoreCase(palavra)) {
			System.out.println("Digite alguma coisa!");
			System.out.println("Se digitar (sair) o programa terminará!");
			palavra = teclado.nextLine();
			System.out.printf("Você disse: %s\n", palavra);
		}
		System.out.println("Fim do Programa");
		teclado.close();
	}

}
