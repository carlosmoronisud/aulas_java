package vetores_Matrizes;

import java.util.Scanner;

public class Exercico_4_While {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        float matrizNotas [] [] = new float [10] [4];
        float media [] = new float [matrizNotas.length];
        boolean continuar = true;         
        int i = 0;
        
        //Entrada
        System.out.println("Digite as notas dos participantes:");
        while (i < matrizNotas.length && continuar) {
        	int soma = 0;
        	int j = 0;
			while (j < matrizNotas[i].length) {
        		System.out.printf("Participante %d | %d° Bimestre: ", i + 1, j + 1);
        		matrizNotas [i] [j] = leia.nextFloat();
        		soma += matrizNotas [i] [j];
        		j++;
        	}
        	media[i] = soma / matrizNotas[i].length;
        	System.out.printf("Média participante %d é: %.1f\n", i+1, media[i]);
        	if (i < matrizNotas.length - 1){
        		System.out.println("Deseja continuar? (s/n)");
        		String resposta = leia.next();
        		continuar = resposta.equalsIgnoreCase("s");
        	}
        	i++;
        }
        //Saída
        System.out.println("\nMédias finais dos participantes:");       
		int k = 0;
		while (k < i) {
        	System.out.printf("Participantes %d: %.1f\n", k + 1, media[k]);
        	k++;
    	}
        		
        leia.close();	       	
	}
}
        