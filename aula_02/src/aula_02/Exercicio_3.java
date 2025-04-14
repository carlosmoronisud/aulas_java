package aula_02;

import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o salário bruto: ");
        float salarioBruto = leia.nextFloat();
        
        System.out.println("Digite o adicional noturno: ");
        float addNoturno = leia.nextFloat();
        
        System.out.println("Digite as horas extras: ");
        float hsHextra = leia.nextFloat();
        
        System.out.println("Digite os descontos: ");
        float descontos = leia.nextFloat();
        
        System.out.printf("\nSeu salário liquido é: %.2f", ((salarioBruto + addNoturno + (hsHextra * 5) - descontos)));
        
    }

}