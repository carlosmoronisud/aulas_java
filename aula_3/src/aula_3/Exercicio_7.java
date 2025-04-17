package aula_3;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double result = 0;
		boolean continuar = true;
		
		while (continuar) {
			System.out.println("\n--Escolha a operação-- (+, -, *, /) ou 'sair' para encerrar");
			String op = leia.next();
		
			if (op.equalsIgnoreCase("sair")) {
				continuar = false;
				break; // saida do loop
			}
			
			System.out.print("Digite o primeiro número:  ");
			double num1 = leia.nextDouble();
			System.out.print("Digite o segundo nùmero:  ");
			double num2 = leia.nextDouble();
			
			switch (op) {
			case "+":
				result = num1 + num2;
				break;
				
			case "-":
				result = num1 - num2;
				break;
				
			case "*":
				result = num1 * num2;
				break;
				
			case "/":
				if (num2 == 0) {
					System.out.println("Divisão por zero não é possivel. Por favor insira outro número");
					
				}else {
					result = num1 / num2;
				}
				break;
			default:
				System.out.println("Operação inválida. Tente novamente.");
				continue;
			}
			
			if (!op.equals("/") || num2 !=0) {
				System.out.println("O resultado é:  " + result);
			}
		}
		leia.close();
		System.out.println("Calculadora encerrada!");
	}
	
	
		
}

