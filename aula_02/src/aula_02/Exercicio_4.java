package aula_02;

import java.util.Scanner;

public class Exercicio_4 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o numero 1: ");
        float n1 = leia.nextFloat();
        
        System.out.println("Digite onumero 2: ");
        float n2 = leia.nextFloat();
        
        System.out.println("Digite o numero 3: ");
        float n3 = leia.nextFloat();
        
        System.out.println("Digite o numero 4: ");
        float n4 = leia.nextFloat();
        
        System.out.printf("\nA diferença do produto entre o número 1 e número 2 pelo produto entre o número 3 e o número 4 é:\n %.2f", ((n1 * n2) - (n3 * n4)));
        
    }

}