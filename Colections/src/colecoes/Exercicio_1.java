package colecoes;

import java.util.ArrayList;  
import java.util.Collections;  
import java.util.Scanner;  

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		
		System.out.println("Digite até 5 cores");
		for( int i = 0; i<5; i++) {
			System.out.printf("\n %d° Cor: ", i+1 );
			String cor = leia.nextLine();
			cores.add(cor);			
		}
		System.out.println("Cores digitadas: ");
		for(var cor: cores) {			
			System.out.println("  " + cor);
		
		}
		Collections.sort(cores);
		System.out.println("Cores em ordem crescente:");
		for(var corOrdCres : cores ) {
			System.out.println("  " + corOrdCres);
		}
		leia.close();
	}

}
