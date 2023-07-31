package Controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o dia da semana: ");
		String dia = teclado.next();
		
		if("domingo".equalsIgnoreCase(dia)) {
			System.out.printf("%s corresponde ao 1° dia da semana.", dia);
		} else if ("segunda".equalsIgnoreCase(dia)) {
			System.out.printf("%s corresponde ao 2° dia da semana.", dia);
		} else if ("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia)) {
			System.out.printf("%s corresponde ao 3° dia da semana.", dia);
		} else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.printf("%s corresponde ao 4° dia da semana.", dia);
		} else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.printf("%s corresponde ao 5° dia da semana.", dia);
		} else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.printf("%s corresponde ao 6° dia da semana.", dia);
		} else if ("sábado".equalsIgnoreCase(dia) || "sabado".equalsIgnoreCase(dia)) {
			System.out.printf("%s corresponde ao 7° dia da semana.", dia);
		} else {
			System.out.println("Data inválida!");
		}
		teclado.close();
	}
}
