module app.financeiro {
	
	requires java.base; //import padrão
	//requires app.calculo;
	
	requires app.api;
	uses br.com.essyx.app.Calculadora;
}