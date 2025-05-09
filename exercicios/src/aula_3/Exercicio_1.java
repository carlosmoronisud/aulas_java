package aula_3;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		int numero_A, numero_B,numero_C, soma_A_B;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		numero_A = leia.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		numero_B = leia.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		numero_C = leia.nextInt();
		
		soma_A_B = (numero_A + numero_B);
		
		if(soma_A_B > numero_C) {
			System.out.printf("%d + %d = %d > %d\n A Soma de A + B é Maior do que C", numero_A, numero_B, soma_A_B , numero_C);
			
		}else if (soma_A_B < numero_C){ 
			System.out.printf("%d + %d = %d < %d\n A Soma de A + B é Menor do que C", numero_A, numero_B, soma_A_B , numero_C);
			
		}else {
			System.out.printf("%d + %d = %d = %d\n A Soma de A + B é Igual a C", numero_A, numero_B, soma_A_B , numero_C);		}
		leia.close();
	}
}