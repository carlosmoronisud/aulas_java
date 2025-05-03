package colecoes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio_Fila {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		Queue<String> fila =  new LinkedList<String>();
		boolean resposta = false;
		String cliente = "n";
		int opcao = 0;
		
		while (!resposta) {
			System.out.println("***********Menu principal**********************");
			System.out.println("1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Clientes");
			System.out.println("0 - Sair");		
			System.out.println("*************************************************");
			System.out.print("Digite a opção desejada: ");
			opcao = leia.nextInt();			
			
			
			switch (opcao) {
				case(1):
					boolean op1 = false;
					while (!op1) {	
						System.out.println("********Opção 01*********");
						System.out.print("Digite o nome do novo cliente ou digite ('0') para sair: \n");
						cliente = leia.next();	
						
						if(cliente.equals("0")) {
							op1 = true;							
						}else {
							fila.add(cliente);
							System.out.println("_______Cliente adicionado!_______\n");
						}
					}											
				break;
				case(2):
					System.out.println("*****Opção 2 *******");
					System.out.println("Clientes adicionados: " + fila);
					System.out.println("________Opção 2 ________\n");
					break;
				case(3):
					System.out.println("*****Opção 3 *******");
					System.out.print("Deseja retirar o cliente "+ fila.peek()+"? (s/n)"  );
					cliente = leia.next();
					if(cliente.equalsIgnoreCase("s")) {
						System.out.println(fila.poll()+ "_______foi retirado!__________\n");
						System.out.println("Fila atual >" + fila);
					}else {
						System.out.println("_________O cliente " + fila.peek()+" Não foi retirado__________\n" );
						System.out.println("Fila atual: \n" + fila);
					}
				break;
				case(0):
					System.out.println("Programa finalizado!");
				return;	
				default:
					System.out.println("Opção inválida!");
			}		
		
		
		}
		
	}

}
