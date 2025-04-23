package colecoes;

import java.util.HashSet;  
import java.util.Iterator;  
import java.util.Scanner;  

public class Exercicio_3 {  
    public static void main(String[] args) {  
       
        HashSet<Integer> numeros = new HashSet<>();  
        Scanner scanner = new Scanner(System.in);  
        
        System.out.println("Digite 10 valores inteiros não repetidos:");  

       
        while (numeros.size() < 10) {  
            System.out.print("Digite um número inteiro: ");  
            int numero = scanner.nextInt();  

           
            if (numeros.add(numero)) {  
                System.out.println("Número adicionado: " + numero);  
            } else {  
                System.out.println("O número " + numero + " já foi inserido. Tente novamente.");  
            }  
        }  

       
        System.out.println("\nListar dados do Set:");  
        Iterator<Integer> iterator = numeros.iterator();  
        while (iterator.hasNext()) {  
            System.out.println(iterator.next());  
        }  

       
        scanner.close();  
    }  
}  