package vetores_Matrizes;

import java.util.Scanner;

public class Exercico_4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		 float matriz [][] = new float [10][4];
		            
		 int i = 0, j = 0;
		 Float soma = 0f;		
		 float media [] = new float [matriz.length];
		 Boolean parar = false;
		 String continuar = "s";
		 
		System.out.println(" Digite a notas: ");
		for(i = 0; i < matriz.length; i++) {			
			for(j = 0;j < matriz[i].length; j++) {
				 System.out.println("Digite os valores da matriz [" + i + "][" + j + "]: ");
				 matriz[i][j] = leia.nextFloat();
				soma = soma += matriz [i][j];				
			}
			System.out.println("Deseja cotinuar? (s/n)");
			continuar = leia.next();
			parar = !continuar.equalsIgnoreCase("s");  
			if (!parar) {  
			    media[i] = soma / matriz[i].length;  
			    System.out.printf(" A soma da sua nota é: %.1f e a média é: %.1f\n ", soma, media[i]);			  
			    soma = 0f;  
			    break;  
			} 						
		}
		System.out.println("Vetor médias: ");
		for(var k : media) {			
			System.out.printf(" [ %.1f ]", k);			
		}		
		leia.close();	
	}
}