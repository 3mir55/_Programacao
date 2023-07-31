package fundamentos.operadores;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		// Meu código (correto), porém usando int e não atribuindo muitas variáveis
		int a = (6 * (3 + 2));
		a = (int) Math.pow(a, 2);
		a = a / (3 * 2);
		
		int b = ((1 - 5) * (2 - 7)) / 2;
		b = (int) Math.pow(b, 2);
		
		int c = a - b;
		c = (int) Math.pow(c, 3);
		
		int d = (int) Math.pow(10, 3);
		
		int solucao = c / d;
		
		System.out.println("O Resultado é: " + solucao);
		
		//Código da resposta
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é: " + resultado);
	}

}
