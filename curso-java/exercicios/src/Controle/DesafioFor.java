package Controle;

public class DesafioFor {
	public static void main(String[] args) {
		String valor = "";
		for (valor = "#"; !valor.contentEquals("######");valor +="#") {
			System.out.println(valor);
		}
	}
}
