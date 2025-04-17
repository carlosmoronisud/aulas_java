package aula_3;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {

		int id;
		float gerente = 0.10f,
			   vendedor = 0.7f,
			   supervisor = 0.9f,
			   motorista = 0.6f,
			   estoquista = 0.5f,
			   tecnico = 0.8f,
			   salario;
		
		String nome;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite o nome do colaborador--");
		nome = leia.nextLine();
		System.out.println("\n--Digite o código do colaborador--");
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite o código 1 Gerente--");
		System.out.println("\n--Digite o código 2 Vendedor--");
		System.out.println("\n--Digite o código 3 Supervisor--");
		System.out.println("\n--Digite o código 4 Motorista--");
		System.out.println("\n--Digite o código 5 Estoquista--");
		System.out.println("\n--Digite o código 6 Técnico de TI--");
		System.out.println("# ## ### #### #########   Fim Menu   ########## #### ### ## #");
		id = leia.nextInt();
		System.out.println("\n--Digite o salário do colaborador--");
		salario = leia.nextFloat();


		switch (id) {
		case 1 :
			System.out.printf("Nome do colaborador:%s \nCargo: Gerente \n Salário: R$ %.2f",
					nome,  (salario + (gerente*salario)));
			break;
		case 2:
			System.out.printf("Nome do colaborador:%s \nCargo:Vendedor \n Salário: R$ %.2f",
					nome,  (salario + (salario*vendedor)));
			break;
		case 3:
			System.out.printf("Nome do colaborador:%s \nCargo:Supervisor \n Salário: R$ %.2f",
					nome,  (salario + (salario*supervisor)));
			break;
		case 4:
			System.out.printf("Nome do colaborador:%s \nCargo: Motorista \n Salário: R$ %.2f",
					nome,  (salario + (salario*motorista)));
			break;
		case 5:
			System.out.printf("Nome do colaborador:%s \nCargo: Estoquista \n Salário: R$ %.2f",
					nome, (salario + (salario*estoquista)));
			break;
		case 6:
			System.out.printf("Nome do colaborador:%s \nCargo: Técnico de ti \n Salário: R$ %.2f",
					nome,  (salario + (salario*tecnico)));
			break;
		default:
			System.out.println("Opção inválida!");
		}
		leia.close();
	}
	
}