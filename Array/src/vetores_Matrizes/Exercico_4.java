package vetores_Matrizes;

import java.util.Scanner;

public class Exercico_4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		 float matriz [][] = new float [10][4];		            		
		 float media [] = new float [matriz.length];
		 
		 System.out.println("Digite as 4 notas de cada participante:");
		 for (int i = 0; i < matriz.length; i++) {
		     float soma = 0f;		     
		     for (int j = 0; j < matriz[i].length; j++) {
		         System.out.printf("Nota participante %d | %d° bimestre: ", i + 1, j + 1);
		         matriz[i][j] = leia.nextFloat();
		         soma += matriz[i][j];
		     }
		     
		     media[i] = soma / matriz[i].length;
		     System.out.printf("Média participante %d: %.1f\n", i + 1, media[i]);
		 }

		 System.out.println("\nMédias finais:");
		 for (int i = 0; i < media.length; i++) {
		     System.out.printf("Participante %d: %.1f\n", i + 1, media[i]);
		 }		
		leia.close();	
	}
}