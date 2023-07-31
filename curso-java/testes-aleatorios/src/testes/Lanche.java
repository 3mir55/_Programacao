package testes;

import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) {
		
		int codigo, quantidade;
		double total;
		Double [] precoUnitario = {4.00, 4.50, 5.00, 2.00, 1.50};
		
		Scanner teclado = new Scanner(System.in);
		String [] pedido = teclado.nextLine().split(" ");
		
		codigo = Integer.parseInt(pedido[0].toString()) - 1;
		quantidade = Integer.parseInt(pedido[1].toString());
		
		total = precoUnitario [codigo] * quantidade;
		
		System.out.printf("Total: R$ %.2f\n", total);
		teclado.close();
	}
}
