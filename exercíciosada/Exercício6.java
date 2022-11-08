package exercíciosada;

import java.util.Scanner;

public class Exercício6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual valor deseja converter? R$ ");
        float valor = entrada.nextFloat();
        System.out.println("Para qual moeda deseja converter?");
        System.out.println("1 - Dólar");
        System.out.println("2 - Euro");
        System.out.println("3 - Libra");
        int opcao = entrada.nextInt();
        
        if (opcao == 1) {
            float convert = valor / 5.09f; 
            System.out.printf("Conversão: US$ %.2f.", convert);
        } else if (opcao == 2) {
            float convert = valor / 5.07f;
            System.out.printf("Conversão: E$ %.2f.", convert);
        } else if (opcao == 3) {
            float convert = valor / 5.82f;
            System.out.printf("Conversão: L$ %.2f.", convert);
        } else {
            System.out.println("Opção inválida. Tente novamente!");
        }
    }
}
