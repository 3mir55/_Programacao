package Controle;

public class Continue {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) { // Testa se é par
				continue; // interrompe a repetição quando i for ímpar
			}
			System.out.println(i);
		}
		System.out.println("Fim!");
	}
}
