package aula_4;

import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int i, contador, menor21, maior50;
        contador = 0;
        menor21 = 0;
        maior50 = 0;
        
        for (i = 1; contador >= 0; i++) {
        	System.out.printf("Digite a %d° idade: \n", i);
        	contador = leia.nextInt();
        	leia.nextLine();
        	
        	if(contador < 21 && contador > 0) {
        		menor21 ++;
        		
        	}else if (contador > 50) {
        		maior50 ++;
        	}
        	
        }
        		
        System.out.printf("\nTotal de pessoas menores de 21 anos: %d", menor21);		
        System.out.printf("\nTotal de pessoas maiores de 50 anos: %d", maior50);			
        		
       
        leia.close();
        
    }
    

}