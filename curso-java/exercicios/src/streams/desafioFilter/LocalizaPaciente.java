package streams.desafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LocalizaPaciente {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente("Anna", 1963, "Feminino");
		Paciente p2 = new Paciente("Maria", 1961, "Feminino");
		Paciente p3 = new Paciente("José", 1960, "Masculino");
		Paciente p4 = new Paciente("Tereza", 1965, "Feminino");
		Paciente p5 = new Paciente("Agostinho", 1953, "Masculino");
		Paciente p6 = new Paciente("Danilo", 1963, "Masculino");
		Paciente p7 = new Paciente("Daniel", 1953, "Masculino");
		Paciente p8 = new Paciente("Aparecida", 1970, "Feminino");
		Paciente p9 = new Paciente("Márcio", 1970, "Masculino");
		
		List<Paciente> pacientes = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9);
		Predicate<Paciente> verAno = p -> p.anoNascimento == 1970;
		Predicate<Paciente> verSexo = p -> p.sexo.equalsIgnoreCase("Feminino");
		Function<Paciente, String> listaPaciente = 
				p -> "O Paciente: " + p.nome + " nascido em " + p.anoNascimento + " é do sexo " + p.sexo;
		
		pacientes.stream()
			.filter(verAno)
			.filter(verSexo)
			.map(listaPaciente)
			.forEach(System.out::println);
		
	}
}
