package vetores_Matrizes;

import java.util.Scanner;

public class Exercicio_2 {
	
	public static void main(String[] args) {	
		
		Scanner leia = new Scanner(System.in);	
		
			int soma = 0;			
			
			int vetor [] = new int [10];
			
			for( int i = 0; i < vetor.length; i++) {
				System.out.println("Digite um número:  ");
				vetor[i] = leia.nextInt();				
			}			
			System.out.println("Elementos nos índices ímpares: ");
			for(int i = 1; i < vetor.length; i+=2) {
				System.out.print(" " + i);
			}
			System.out.println("\nElementos pares: ");
			for(var i : vetor) {
				if(i % 2 == 0) {
					System.out.print(" " + i);			
				}
				soma = soma += i;
			}
			Float media = (float) soma / vetor.length;
			leia.close();
			System.out.printf("\nSoma: %d", soma );			
			System.out.printf("\nMédia: %.2f" , media);
	}
}
			