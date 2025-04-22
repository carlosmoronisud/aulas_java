package vetores_Matrizes;

import java.util.Scanner;

public class matrizes {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		//int matrizInteiros[][] = {{10, 15, 35}, {70, 120, 140}, {50, 100, 150}};
		
		Float matrizReal [] [] = new Float [3] [3];
		
		for (int linha = 0; linha < matrizReal.length; linha ++) {
			for (int coluna = 0; coluna < matrizReal.length; coluna ++ ) {
				System.out.printf("\n matrizInteiros[%d][%d] = %d", linha, coluna, matrizReal[linha] [coluna]);
				matrizReal[linha] [coluna] = leia.nextFloat();
			}
		}
		for(Float []  vetor: matrizReal) {
			for(var valor : vetor) {
				System.out.println("Exibir a posição atual: " + valor );
			}
		}
	}

}
