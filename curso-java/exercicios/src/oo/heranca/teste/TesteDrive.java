package oo.heranca.teste;

import oo.heranca.desafio1.Fusca;
import oo.heranca.desafio1.Mustang;

public class TesteDrive {
	
	public static void main(String[] args) {
		
		Fusca carro1 = new Fusca();
				
		carro1.acelerar();
		System.out.println(carro1);

		carro1.acelerar();
		System.out.println(carro1);

		carro1.acelerar();
		System.out.println(carro1);
		
		Mustang carro2 = new Mustang(400);
		carro2.ligarTurbo();
		carro2.ligarAr();
		carro2.desligarAr();
		
		System.out.println(carro2.velocidadeDoAr());
		
		carro2.acelerar();
		carro2.frear();
		System.out.println(carro2);
		
		carro2.acelerar();
		carro2.frear();
		System.out.println(carro2);

		carro2.acelerar();
		System.out.println(carro2);		
	}
}
