package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	//Ana mae = new Ana();
	
	void testeAcessos() {
		
//		segredo;
//		facoDentroDeCasa; //default ou pacote
//		formaDeFalar;
//		todosSabem;
		//System.out.println(segredo);
		//System.out.println(facoDentroDeCasa);
		System.out.println(formaDeFalar); //somente via herança, não funciona por instância
		System.out.println(todosSabem);
	}
}
