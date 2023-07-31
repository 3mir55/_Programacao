package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(){
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFormatada () {
		return String.format("%d/%d/%d", this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() { //não deve ser usada pois não retorna nada, sendo útil apenas para o terminal
		System.out.println(obterDataFormatada());
	}
}
