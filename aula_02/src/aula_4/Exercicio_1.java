package aula_4;

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int contador, primeiroNumero, ultimoNumero;
        
        
        
        System.out.print("Digite o primeiro número do intervalo: ");
        primeiroNumero = leia.nextInt();
        
        System.out.print("Digite o último número do intervalo: ");
        ultimoNumero = leia.nextInt();
        
        if (primeiroNumero >= ultimoNumero) {
            System.out.println("\nIntervalo inválido!");
        }
        
        System.out.println("\nNo Intervalo entre "
        + primeiroNumero + " e " + ultimoNumero + ":");
        System.out.println();
        
        for (contador = primeiroNumero; contador <= ultimoNumero; contador++) {
            if (contador % 3 == 0 && contador % 5 == 0) {
                System.out.println(contador + " é múltiplo de 3 e 5");
            }
            
        leia.close();
        }
        
        
    }
}