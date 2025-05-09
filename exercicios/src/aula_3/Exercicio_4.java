package aula_3;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Escolha uma opção: Vertebrado / Invertebrado");
        String tipo = leia.nextLine();

        if (tipo.equalsIgnoreCase("Vertebrado")) {
            System.out.println("Escolha: Mamífero / Ave");
            String classe = leia.nextLine();

            if (classe.equalsIgnoreCase("Ave")) {
                System.out.println("Escolha: Carnívoro / Onívoro");
                String dieta = leia.nextLine();

                if (dieta.equalsIgnoreCase("Carnívoro")) {
                    System.out.println("Águia");
                } else if (dieta.equalsIgnoreCase("Onívoro")) {
                    System.out.println("Pomba");
                }
                else {
                    System.out.println("Opção inválida!");
                }
            } 
            else if (classe.equalsIgnoreCase("Mamífero")) {
                System.out.println("Escolha: Onívoro / Herbívoro");
                String dieta = leia.nextLine();

                if (dieta.equalsIgnoreCase("Onívoro")) {
                    System.out.println("Homem");
                } else if (dieta.equalsIgnoreCase("Herbívoro")) {
                    System.out.println("Vaca");
                }
                else {
                    System.out.println("Opção inválida!");
                }
            }
        } 
        else if (tipo.equalsIgnoreCase("Invertebrado")) {
            System.out.println("Escolha: Inseto / Anelídeo");
            String classe = leia.nextLine();

            if (classe.equalsIgnoreCase("Inseto")) {
                System.out.println("Escolha: Hematófago / Herbívoro");
                String dieta = leia.nextLine();

                if (dieta.equalsIgnoreCase("Hematófago")) {
                    System.out.println("Pulga");
                } else if (dieta.equalsIgnoreCase("Herbívoro")) {
                    System.out.println("Lagarta");
                }
                else {
                    System.out.println("Opção inválida!");
                }
            } 
            else if (classe.equalsIgnoreCase("Anelídeo")) {
                System.out.println("Escolha: Hematófago / Onívoro");
                String dieta = leia.nextLine();

                if (dieta.equalsIgnoreCase("Hematófago")) {
                    System.out.println("Sanguessuga");
                } else if (dieta.equalsIgnoreCase("Onívoro")) {
                    System.out.println("Minhoca");
                }
                else {
                    System.out.println("Opção inválida!");
                }
            }
        } 
        else {
            System.out.println("Opção inválida!");
        }

        leia.close();
    }
}