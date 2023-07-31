package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor do pimeiro número:");
		String num1 = teclado.next();
		
		System.out.println("Digite o valor do segundo número:");
		String num2 = teclado.next();
		
		System.out.println("Digite qual operação vc deseja: (+ - * / %)");
		String operador = teclado.next();
				
		double valor1 = Double.parseDouble(num1);
		double valor2 = Double.parseDouble(num2);
	
		double resultado = "+".equals(operador) ? valor1 + valor2 : 0; 
		resultado = "-".equals(operador) ? valor1 - valor2 : resultado;
		resultado = "*".equals(operador) ? valor1 * valor2 : resultado;
		resultado = "/".equals(operador) ? valor1 / valor2 : resultado;
		resultado = "%".equals(operador) ? valor1 % valor2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", valor1, operador, valor2, resultado);
		teclado.close();
	}
}
