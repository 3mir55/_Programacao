package fundamentos;

public class inferencia {
	public static void main(String[] args) {
		
		double a = 4.5; //variavel declarada e inicializada
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto"; //após definir o tipo ele não pode ser mudado
		System.out.println(c);

		c = "outro texto";
		System.out.println(c);
		
		double d; //variavel foi declarada
		d = 123.65; //variavel inicializada
		System.out.println(d); //usada
		
		var e = 123.45; //a variavel tem que ser inicializada quando declarada
		System.out.println(e);
		
		var f = 12; // inteiro
		//f = 12.01; não pode ser usado pois f é inteiro
		System.out.println(f);
	}

}
