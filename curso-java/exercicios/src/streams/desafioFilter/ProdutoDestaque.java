package streams.desafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProdutoDestaque {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 3450.0, 0.15, 0.0);
		Produto p2 = new Produto("Televisor 50\"", 2650.0, 0.20, 50.0);
		Produto p3 = new Produto("Mochila", 340.0, 0.35, 0.0);
		Produto p4 = new Produto("Ar Condicionado", 2550.0, 0.25, 100.0);
		Produto p5 = new Produto("Ventilador", 145.0, 0.10, 25.0);
		Produto p6 = new Produto("Celular", 3000.0, 0.30, 0.0);
		Produto p7 = new Produto("Tablet", 2480.0, 0.25, 0.0);
		Produto p8 = new Produto("Aspirador de pó", 250.0, 0.30, 0.0);
	
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);
		
		Predicate<Produto> superDesconto = ofer -> ofer.desconto >= 0.30;
		Predicate<Produto> freteGratis = ofer -> ofer.frete == 0.0;
		
		Function<Produto, String> specialOfer = 
				ofer -> "Oferta especial!! " + ofer.nome + " com "
						+ (ofer.desconto*100)
						+ "% de Desconto e Frete Grátis! De: R$"
						+ ofer.valor + " por apenas: R$" + (ofer.valor *(1 - ofer.desconto));
		
		produtos.stream()
			.filter(superDesconto)
			.filter(freteGratis)
			.map(specialOfer)
			.forEach(System.out::println);
		
	}
}
