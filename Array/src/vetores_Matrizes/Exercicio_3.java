package vetores_Matrizes;  

import java.util.Scanner;  

public class Exercicio_3 {  

    public static void main(String[] args) {  
        Scanner leia = new Scanner(System.in);  

        int matriz[][] = new int[3][3], somaDiagPrinc = 0, somaDiagSec = 0;  

        // Entrada 
        for (int i = 0; i < matriz.length; i++) {  
            for (int j = 0; j < matriz[i].length; j++) { 
                System.out.println("Digite os valores da matriz [" + i + "][" + j + "]: ");  
                matriz[i][j] = leia.nextInt();               
            }  
        }  
        System.out.println("Elementos da Diagonal Principal:");  
        for (int i = 0; i < matriz.length; i++) {  
            somaDiagPrinc += matriz[i][i];  
            System.out.print(" " + matriz[i][i]);  
        }
        System.out.println("\nElementos da Diagonal Secundária: ");  
        for (int i = 0; i < matriz.length; i++) {  
            int j = 2 - i; //Aqui eu fritei a cuca
            somaDiagSec += matriz[i][j];  
            System.out.print(" " + matriz[i][j]);  
        } 

        leia.close();  
        System.out.print("\nSoma dos elementos da Diagonal Principal: " + somaDiagPrinc);  
        System.out.print("\nSoma dos elementos da Diagonal Secundária: " + somaDiagSec);  
    }  
}  