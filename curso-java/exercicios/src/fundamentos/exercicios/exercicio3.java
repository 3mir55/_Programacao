package fundamentos.exercicios;

import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Qual é a sua altura?");
		double altura = teclado.nextDouble();
		
		System.out.println("Qual é o seu peso?");
		double peso = teclado.nextDouble();

		double Imc = peso / (Math.pow(altura , 2));
		System.out.printf("Seu IMC é de: %.2f", Imc);
				
		teclado.close();
	}
}
