package testes;

import java.io.IOException;
import java.util.Scanner;

public class Salario2 {

	public static void main(String[] args) throws IOException {

		String nome;
		double salario;
		double vendas;
		double salarioFinal;
		
		Scanner teclado = new Scanner(System.in);
		nome = teclado.next();
		salario = teclado.nextDouble();
		vendas = teclado.nextDouble();
		salarioFinal = salario + (vendas* 0.15);
		System.out.printf("%s tem salário TOTAL = R$ %.2f\n", nome, salarioFinal);
		teclado.close();
	}
}
