package br.com.essyx.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {

	void valorAlterado(String novoValor);
}
