package colecoes;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		Scanner leia =  new Scanner  (System.in);
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.add("Comunicação não violenta");
		pilha.add("It A coisa");
		pilha.add("A Coragem de ser imperfeito");
		pilha.add("Quem pensa enriquece");
		pilha.add("O diario de um Banana");
		pilha.add("O senhor dos aneis");
		pilha.add("O codigo davince");
		
		// Adiciona itens a pilha pelo usuario
		System.out.println(" Digite um livro:  ");
		pilha.add(leia.nextLine());
		
		
		// Imprime a pilha
		System.out.println(pilha);
		
		
		pilha.pop();
		//removendo itens da fila
		
		System.out.println(pilha);
		
		// adicionando elementos na pilha
		pilha.push("Roube como um artista");
		
		System.out.println(pilha);
		
		System.out.println(pilha.peek());
		
		System.out.println(" Diario de uma bana existe na pilha? " + pilha.contains("O diario de um Banana"));
		
		
;
		
	}

}
