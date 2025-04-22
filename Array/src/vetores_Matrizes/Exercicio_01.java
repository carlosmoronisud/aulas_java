package vetores_Matrizes;

import java.util.Scanner;

public class Exercicio_01 {
	
	public static void main(String[] args) {
		
		try (Scanner leia = new Scanner(System.in)) {
			
			int vetor [] = {2,5,1,3,4,9,7,8,10,6},	numeroUsuario, i;
			boolean numeroEncontrado = false;
			
			System.out.println("Digite um número: ");
			 numeroUsuario = leia.nextInt();
			
			for ( i = 0; i < vetor.length; i++) {
				
				if (numeroUsuario == vetor[i]) {
					numeroEncontrado = true; 
					break;
				}					
			}
			leia.close();
			if (numeroEncontrado == true) {
				System.out.printf("Numero o número %d está na posição: %d", numeroUsuario, i);
			}else {
				System.out.printf("\nO numero %d Não foi encontrado!", numeroUsuario);
			}
		}
	}
		
}	
