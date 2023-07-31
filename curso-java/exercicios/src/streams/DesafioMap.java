package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		/*
		 * 1. Número para string binária... 6 => "110"
		 * 2. Inverter a string... "110" => "011"
		 * 3. Converter de volta para inteiro => "011" => 3
		 */
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Consumer<Integer> print = System.out::println;
		
		UnaryOperator<String> inverter = texto -> new StringBuilder(texto).reverse().toString();
		
		Function<String, Integer> binToInt = s -> Integer.parseInt(s, 2);
		
		nums.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(binToInt)
			.forEach(print);
		
		
		
	}
}
