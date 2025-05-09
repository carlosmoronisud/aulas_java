package aula_3;

import java.util.Scanner;

public class Exercicio_3 {

    public static void main(String[] args) {
        int idade;
        String nome;
        boolean primeiraDoacao = false;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o Nome do doador: ");
        nome = leia.nextLine();
        
        System.out.println("Digite a Idade do doador: ");
        idade = leia.nextInt();
        
        // Verificação para doadores entre 60 e 69 anos
        if(idade >= 60 && idade <= 69) {
            System.out.println("É a primeira doação de sangue? (true ou false)");
            primeiraDoacao = leia.nextBoolean();
        }
        
        // Verificação das condições para doação
        if(idade >= 18 && idade <= 69) {
            if(idade < 60 || (idade >= 60 && !primeiraDoacao)) {
                System.out.printf("%s está apto para doar sangue!\n", nome);
            } else {
                System.out.printf("%s não está apto para doar sangue!\n", nome);
            }
        } else {
            System.out.printf("%s não está apto para doar sangue!\n", nome);
        }
        
        leia.close();
    }
}