package aula_4;

import java.util.Scanner;

public class Exercico_2 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int i, contador, par, impar;
        contador = 0;
        par = 0;
        impar = 0;
        
        for (i = 1; i <= 10; i++) {
        	System.out.printf("Digite o %d° número: \n", i);
        	contador = leia.nextInt();
        	leia.nextLine();
        	
        	if(contador % 2 == 0) {
        		par ++;
        	}else {
        		impar ++;
        	}
        	
        }
        		
        System.out.printf("\nTotal de números pares: %d", par);		
        System.out.printf("\nTotal de números impares: %d", impar);			
        		
       
        leia.close();
        
    }
    

}