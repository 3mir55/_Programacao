package Controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double nota = 0, contador = 0, notaFinal = 0, media = 0;
		
		while (nota != -1) {
			
			System.out.print("Digite a nota do aluno (ou -1 para sair): ");
			nota = teclado.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				notaFinal = notaFinal + nota;
				contador++;
			} else if(nota != -1){
				System.out.println("nota Inválida");
			}
			media = notaFinal / contador;
		}
		System.out.printf( "A média entre os %.0f alunos é: %.1f\n",contador, media);

		teclado.close();
	}
}
