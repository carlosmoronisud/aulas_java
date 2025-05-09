package aula_3;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {

		int opcao;
		float saldo = 1000.0f;
		
		Scanner leia = new Scanner(System.in);

		
		System.out.println("--Digite a operação desejada-- (1 para Saldo /  para Saque / 3 para Depósito");
		opcao = leia.nextInt();

		switch (opcao) {
		case 1:
			System.out.printf("Operação  - Saldo\n Saldo: %.2f " ,saldo);			
			break;
			
		case 2:
			System.out.println("Quanto deseja sacar?");
			float saque = leia.nextFloat();
			if (saque > saldo) {
				System.out.println("Operação - Saque\n Saldo Insufisiente! ");
			}else {
				System.out.printf("Saldo atual: %.2f " , (saldo - saque));
			}
			System.out.println("Operação finalizada!");
			break;
			
		case 3:
			System.out.println("Operação Depósito \n Qual o Valor? ");
			float deposito = leia.nextInt();			
			System.out.printf("Saldo atual: %.2f " , (saldo + deposito));
			break;
			
		
		default:
			System.out.println("Operação inválida!");
		}
		leia.close();
	}
	
}