package aula_3;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		int numero_1, numero_2,numero_C, soma_A_B;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		numero_1 = leia.nextInt();
		
		
		if(numero_1 > 0 && numero_1 % 2 == 0) {
			System.out.printf("O Número %d é par e positivo!", numero_1);
			
		}else if (numero_1 < 0 && numero_1 % 2 != 0) {
			System.out.printf("O Número %d é ímpar e negativo!", numero_1);
			
		}else if (numero_1 < 0 && numero_1 % 2 == 0) {
			System.out.printf("O Número %d é par e negativo!", numero_1);
			
		}else if (numero_1 > 0 && numero_1 % 2 != 0) {
			System.out.printf("O Número %d é ímpar e posititivo!", numero_1);
			
			
		}else {
			System.out.printf("O Número %d é par, mas não é positivo e nem negativo!", numero_1);		
		}
		leia.close();
	}
}