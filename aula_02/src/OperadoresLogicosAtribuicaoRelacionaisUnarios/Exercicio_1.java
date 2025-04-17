package OperadoresLogicosAtribuicaoRelacionaisUnarios;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o Salario: ");
		float salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		float abono = leia.nextFloat();
		
		System.out.printf("\nSeu novo salário é: %.2f", (salario + abono));
		
	}

}
