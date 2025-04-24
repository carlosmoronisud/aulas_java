package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio_3{
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Set<Integer> num = new HashSet<Integer>();
		ArrayList<Integer>numerosOrdenados = new ArrayList<Integer>();
		int  numeros = 0;
		
		System.out.println("Digite 10 números: ");
		while (num.size() < 10) {
			System.out.println("Digite o um número:  ");
			numeros = leia.nextInt();			
			
			if(num.add(numeros)) {
				System.out.println("Numero adicionado: " + numeros);				
				numerosOrdenados.add(numeros);
			}else {
				System.out.printf("O número %d já foi digitado! \n", numeros);
			}
		}		
		System.out.println("\nLista Ordenada:");
		for(Integer n : num) {
			System.out.print(n);
		}

		System.out.println("\nLista Original: ");
		for(Integer ord : numerosOrdenados) {
			System.out.print(ord);
		}
		
		
		leia.close();
	}
}