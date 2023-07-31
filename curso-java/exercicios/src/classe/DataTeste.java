package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		
		Data d2 = new Data(11, 07, 1999);
		
		String dataFormatada1 = d1.obterDataFormatada();

		System.out.printf("A data é: %s\n", dataFormatada1);
		System.out.printf("A data é: %s\n", d2.obterDataFormatada());		
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
	}
}
