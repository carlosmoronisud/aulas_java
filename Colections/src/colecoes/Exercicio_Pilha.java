package colecoes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio_Pilha {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		Stack<String> pilha = new Stack<String>();
		boolean resposta = false;
		String livro = "n";
		int opcao = 0;
		
		while (!resposta) {
			System.out.println("***********Menu principal**********************");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Clientes");
			System.out.println("0 - Sair");		
			System.out.println("*************************************************");
			System.out.print("Digite a opção desejada: ");
			opcao = leia.nextInt();			
			
			
			switch (opcao) {
				case(1):
					boolean op1 = false;
					while (!op1) {	
						System.out.println("********Opção 01*********");
						System.out.print("Digite o nome do novo livro ou digite ('0') para sair: \n");
						livro = leia.nextLine();	
						
						if(livro.equals("0")) {
							op1 = true;							
						}else {
							pilha.add(livro);
							System.out.println("_______Livro adicionado!_______\n");
						}
					}											
				break;
				case(2):
					System.out.println("*****Opção 2 *******");
					System.out.println("Livros adicionados: " + pilha);
					System.out.println("________Opção 2 ________\n");
					break;
				case(3):
					System.out.println("*****Opção 3 *******");
					System.out.print("Deseja retirar o livro "+ pilha.peek()+"? (s/n)"  );
					livro = leia.next();
					if(livro.equalsIgnoreCase("s")) {
						System.out.println(pilha.pop()+ "_______foi retirado!__________\n");
						System.out.println("Pilha atual >" + pilha);
					}else {
						System.out.println("_________O Livro " + pilha.peek()+" Não foi retirado__________\n" );
						System.out.println("Fila atual: \n" + pilha);
					}
				break;
				case(0):
					System.out.println("Programa finalizado!");
				return;	
				default:
					System.out.println("Opção inválida!");
			}		
		
		
		}
		leia.close();	}

}
