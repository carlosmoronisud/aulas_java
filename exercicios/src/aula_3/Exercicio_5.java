package aula_3;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {

		int opcao, quantidade;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite 1 Cachorro quente--");
		System.out.println("--Digite 2 X - Salada--");
		System.out.println("--Digite 3 X - Bacon--");
		System.out.println("--Digite 4 X - Bauru--");
		System.out.println("--Digite 5 X - Refrigerante--");
		System.out.println("--Digite 6 X - Suco de Laranja--");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Quantos?");
			quantidade = leia.nextInt();
			System.out.printf("Valor total: R$%.2f \nProduto: Cachorro Quente", (quantidade * 10.0));
			break;
		case 2:
			System.out.println("Quantos?");
			quantidade = leia.nextInt();
			System.out.printf("Valor total: R$%.2f \nProduto: X-Salada", (quantidade * 15.0));
			break;
		case 3:
			System.out.println("Quantos?");
			quantidade = leia.nextInt();
			System.out.printf("Valor total: R$%.2f \nProduto: X - Bacon", (quantidade * 15.0));
			break;
		case 4:
			System.out.println("Quantos?");
			quantidade = leia.nextInt();
			System.out.printf("Valor total: R$%.2f \nProduto:  X - Bauru", (quantidade * 18.0));
			break;
		case 5:
			System.out.println("Quantos?");
			quantidade = leia.nextInt();
			System.out.printf("Valor total: R$%.2f \nProduto:  Refrigerante", (quantidade * 10.0));
			break;
		case 6:
			System.out.println("Quantos?");
			quantidade = leia.nextInt();
			System.out.printf("Valor total: R$%.2f \nProduto: Suco de Laranja", (quantidade * 13.0));
			break;
		default:
			System.out.println("Opção inválida!");
		}
		leia.close();
	}
	
}