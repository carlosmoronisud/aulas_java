package colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner leia =  new Scanner(System.in);
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(2);  
        num.add(5);  
        num.add(1);  
        num.add(3);  
        num.add(4);  
        num.add(9);  
        num.add(7);  
        num.add(8);  
        num.add(10);  
        num.add(6);  
        
        System.out.println("Selecione um Número");
        System.out.println("0 1 2 3 4 5 6 7 8 9");
        System.out.println("Lista de numeros");
        System.out.println(num);
        System.out.println("Digite um número e veja seu indice: ");        
        int encontraNum = leia.nextInt();
        
        
        int indice = num.indexOf(encontraNum);
        
        if(indice != -1) {
        	System.out.printf("O número %d  está no indice %d\n", encontraNum, indice);
        }
        else {
        	System.out.println("O número %d não foi encontrado! %d" + encontraNum);
        }
        leia.close();
        
	}

	

}
