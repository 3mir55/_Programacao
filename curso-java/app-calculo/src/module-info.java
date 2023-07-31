module app.calculo { //open no singular para módulo
	
	requires transitive app.logging;
	exports br.com.essyx.app.calculo;
	
//	exports br.com.essyx.app.calculo.interno
//		to app.financeiro;
	
	opens br.com.essyx.app.calculo to app.financeiro; // opens no plural apenas para pacote
	
	requires app.api;
	provides br.com.essyx.app.Calculadora with br.com.essyx.app.calculo.CalculadoraImpl;
}