package aula_4;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
       
        int backend = 0;
        int mulheresFrontend = 0;
        int homensMobileMaior40 = 0;
        int naoBinariosFullStackMenor30 = 0;
        int totalPessoas = 0;
        int somaIdades = 0;
        
        char continuar = 'S';
        
        while (continuar == 'S' || continuar == 's') {
            // Ler dos dados
            System.out.print("Idade: ");
            int idade = leia.nextInt();
            
            System.out.print("Identidade de Gênero: ");
            int genero = leia.nextInt();
            
            System.out.print("Pessoa Desenvolvedora: ");
            int dev = leia.nextInt();
            
            leia.nextLine(); // Limpar buffer
            
            // Atualiza contagens
            totalPessoas++;
            somaIdades += idade;
            
            // 1. Contagem Backend
            if (dev == 1) {
                backend++;
            }
            
            // 2. Mulheres Cis/Trans Frontend
            if ((genero == 1 || genero == 4) && dev == 2) {
                mulheresFrontend++;
            }
            
            // 3. Homens Cis/Trans Mobile >40
            if ((genero == 2 || genero == 5) && dev == 3 && idade > 40) {
                homensMobileMaior40++;
            }
            
            // 4. Não Binários FullStack <30
            if (genero == 3 && dev == 4 && idade < 30) {
                naoBinariosFullStackMenor30++;
            }
            
            // Pergunta se deseja continuar
            System.out.print("\nDeseja continuar (S/N): ");
            continuar = leia.nextLine().charAt(0);
            System.out.println();
        }
        
        // Cálculo da média
        double mediaIdade = totalPessoas > 0 ? (double) somaIdades / totalPessoas : 0;
        
        // Exibição dos resultados
        System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + backend);
        System.out.println("\nTotal de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulheresFrontend);
        System.out.println("\nTotal de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homensMobileMaior40);
        System.out.println("\nTotal de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + naoBinariosFullStackMenor30);
        System.out.println("\nO número total de pessoas que responderam à pesquisa: " + totalPessoas);
        System.out.printf("\nA média de idade das pessoas que responderam à pesquisa: %.2f\n", mediaIdade);
        
        leia.close();
    }
}