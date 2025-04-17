package aula_4;

import java.util.Scanner;

public class Exercicio_5 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int contador,positivo;
        
        positivo = 0;
        
        System.out.println("Digite números inteiros (0 para sair):");
        
        do {       
        	System.out.printf("Digite um número: \n");
        	contador = leia.nextInt();
        	
        	
        	if(contador > 0 ) {
        		positivo += contador;
        		
        	}
        
        } while ( contador != 0);
        leia.close();	
        System.out.printf("\nA soma dos números positivos é: %d", positivo);		
        
       
        
        
    }
    

}