package lambdas;

@FunctionalInterface
public interface Calculo {
	
	double executar(double a, double b); //somente um método abstrato
	
	default String legal() { 
		return "Legal";
	}
	static String muitoLegal() { // não tem acesso ao this por ser static
		return "Muito Legal";
	}
}
