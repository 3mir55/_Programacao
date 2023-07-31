package br.com.essyx.cm;

import br.com.essyx.cm.modelo.Tabuleiro;
import br.com.essyx.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		
		new TabuleiroConsole(tabuleiro);
	}
}
