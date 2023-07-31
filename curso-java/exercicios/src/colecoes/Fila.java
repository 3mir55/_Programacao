package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		
		// Offer e Add -> adicionam elementos a fila
		// A diferença é o comportamento quando a fila está cheia
		// add -> retorna um erro pois não consegue adicionar
		// offer -> retorna false pois a fila está cheia
		
		fila.add("Ana");
		fila.offer("Bia");
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// peek e element -> obter o próximo elemento da fila
		// sem remover
		// A diferença é o comportamento quando a fila está vazia
		// Peek -> quando a fila está vazia retorna null
		// element -> Erro!! quando a fila está vazia lança Exception
		System.out.println(fila.peek()); 
		System.out.println(fila.element());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();

		// Poll e Remove -> obter o próximo elemento da fila e remove!
		// A diferença é o comportamento quando a fila está vazia
		
		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.remove()); //Lança exception
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
	}
}
