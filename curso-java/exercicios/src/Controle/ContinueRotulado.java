package Controle;
//Não usar isso rotineiramente
public class ContinueRotulado {
	public static void main(String[] args) {
		
		externo: 
		for (int i = 0; i < 3; i++) { //externo é um rótulo para o for
			for (int j = 0; j < 3; j++) {
				if (i == 1) {
					continue externo; // o rótulo faz com que o continue influencie o for externo
				}
				System.out.printf("[%d %d] ", i, j);
			}
			System.out.println();
		}
		System.out.println("Fim!!");
	}
}