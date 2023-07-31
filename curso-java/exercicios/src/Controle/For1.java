package Controle;

public class For1 {
	public static void main(String[] args) {
		for(int contador = 1; contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);
		}
		
//		int x = 2;  // é possível fazer separadamente, mas não deve ser usado
//		for (;x < 10;) {
//			System.out.println("X = " + x);
//			x++;
//		}
		
		// Laço infinito
		for(;;) {
			System.out.println("Fim!");
		}
	}

}
