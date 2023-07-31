package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		final double AJUSTE = 32, FATOR = 5.0/9.0; //final transforma a variável em constante
		double fahrenheit = 86, Celsius;
		
		Celsius = (fahrenheit - AJUSTE)* FATOR;
		System.out.println("A temperatura é: " + Celsius + " °C.");
	}

}
