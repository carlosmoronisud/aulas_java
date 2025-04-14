package aula_02;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nota 1: ");
		float nota_1 = leia.nextFloat();
		
		System.out.println("Digite o nota 2: ");
		float nota_2 = leia.nextFloat();
		
		System.out.println("Digite o nota 3: ");
		float nota_3 = leia.nextFloat();
		
		System.out.println("Digite o nota 4: ");
		float nota_4 = leia.nextFloat();
		
		System.out.printf("\nSua média é: %.1f", ((nota_1 + nota_2 + nota_3 + nota_4) / 4));
		
	}

}