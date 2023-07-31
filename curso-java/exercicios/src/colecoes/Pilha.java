package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		for (String l : livros) {
			System.out.println(l);
		}
		System.out.println(livros.peek()); // retorna o ultimo valor da pilha
		System.out.println(livros.element()); // retorna o ultimo valor da pilha
		
		System.out.println(livros.pop()); // lança exception caso pilha vazia
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		
	}
}
