package aula_4;
import java.util.Scanner;
public class Exercico_6 {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        
        int contador,somaMultiplos = 0, qMultiplos3 = 0;
        float media = 0;
       
        
        System.out.println("Digite números inteiros (0 para sair):");
        
        do {       
        	System.out.printf("Digite um número: \n");
        	contador = leia.nextInt();
        	
        	
        	if(contador % 3 == 0 && contador != 0) {
        		somaMultiplos += contador;
        		qMultiplos3 ++;
        	}
        
        } while ( contador != 0);
        
        if (qMultiplos3 > 0 ) {
        	media = (float) somaMultiplos / qMultiplos3;
        }            
        System.out.printf("\nA média de todos os números múltiplos de 3 é: %.1f", media);		        
        leia.close();           
    }
}