package testes;

import java.io.IOException;
import java.util.Scanner;

public class CodPecasValor {

public static void main(String[] args) throws IOException {
		
		int quantidadeA, quantidadeB;
		String vUnitA, vUnitB, qtdA, qtdB;
		Double valorUnitProd1, valorUnitProd2;
		double total;
		
		Scanner teclado = new Scanner(System.in);
		
		String [] prod1 = teclado.nextLine().split(" ");		
		qtdA = prod1[1];
		quantidadeA = Integer.parseInt(qtdA);
		vUnitA = prod1[2];		
		valorUnitProd1 = Double.parseDouble(vUnitA);
		
		String [] prod2 = teclado.nextLine().split(" ");
		qtdB = prod2[1];
		quantidadeB = Integer.parseInt(qtdB);
		vUnitB = prod2[2];
		valorUnitProd2 = Double.parseDouble(vUnitB);
		
		total = (quantidadeA * valorUnitProd1) + (quantidadeB * valorUnitProd2);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
		
		teclado.close();
	}

}
