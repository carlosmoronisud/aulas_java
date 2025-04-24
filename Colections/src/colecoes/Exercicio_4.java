package colecoes;

import java.util.HashSet;  
import java.util.Scanner;  

public class Exercicio_4 {  
    public static void main(String[] args) {  
       
        HashSet<Integer> numeros = new HashSet<>();  
        numeros.add(2);  
        numeros.add(5);  
        numeros.add(1);  
        numeros.add(3);  
        numeros.add(4);  
        numeros.add(9);  
        numeros.add(7);  
        numeros.add(8);  
        numeros.add(10);  
        numeros.add(6);  

       
        System.out.println("0 1 2 3 4 5 6 7 8 9");  
        System.out.println(numeros);  

       
        Scanner leia = new Scanner(System.in);  
        
     
        System.out.print("\nDigite o número que você deseja encontrar: ");  
        int numeroBuscado = leia.nextInt();  

       
        if (numeros.contains(numeroBuscado)) {  
            System.out.printf("O número %d foi encontrado!\n", numeroBuscado);  
        } else {  
            System.out.printf("O número %d não foi encontrado!\n", numeroBuscado);  
        }  
        
 
        leia.close();  
    }  
}  
