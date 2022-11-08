package exercíciosada;

import java.util.Scanner;

public class Exercício11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor total da compra: R$ ");
        float valor = entrada.nextFloat();
        
        System.out.println("Quantas parcelas? ");
        System.out.println("1 - À vista");
        System.out.println("2 - 2 X");
        System.out.println("3 - 3 X");
        System.out.println("4 - 4 X");
        System.out.println("5 - 5 X");
        System.out.print("Digite a opção: ");
        int opcao = entrada.nextInt();
        
        if (opcao == 1) {
            System.out.printf("A sua compra fica no total de R$ %.2f.", valor);
        } else if (opcao == 2) {
            float tot = valor / 2;
            System.out.printf("A sua compra fica em 2 parcelas de R$ %.2f.", tot);
        } else if (opcao == 3) {
            float tot = valor / 3;
            System.out.printf("A sua compra fica em 3 parcelas de R$ %.2f.", tot);
        } else if (opcao == 4) {
            float tot = valor / 4;
            System.out.printf("A sua compra fica em 4 parcelas de R$ %.2f.", tot);
        } else if (opcao == 5) {
            float tot = valor / 5;
            System.out.printf("A sua compra fica em 5 parcelas de R$ %.2f.", tot);
        } else {
            System.out.println("Opção inválida. Tente novamente!");
        }
    }
}