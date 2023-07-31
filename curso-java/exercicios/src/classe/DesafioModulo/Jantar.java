package classe.DesafioModulo;

public class Jantar {
	public static void main(String[] args) {
		
		Comida arroz = new Comida("Arroz com legumes", 0.500);
		Comida feijao = new Comida("Feijão Tropeiro", 0.750);

		Pessoa pessoa1 = new Pessoa("João", 90);
		Pessoa pessoa2 = new Pessoa("Maria", 60);

		System.out.println(pessoa1.apresentar());
		System.out.println(pessoa2.apresentar());
		
		System.out.printf("%s pesa %.3f Kg\n", arroz.comida, arroz.pesoComida);
		System.out.printf("%s pesa %.3f Kg\n", feijao.comida, feijao.pesoComida);
		
		pessoa1.comer(feijao);
		pessoa2.comer(arroz);
		
		System.out.println(pessoa1.apresentar());
		System.out.println(pessoa2.apresentar());
		
		
		
	}
}
