package exercíciosada;

import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float n1 = entrada.nextFloat();
        System.out.print("Digite outro número: ");
        float n2 = entrada.nextFloat();
        System.out.println("Qual operação deseja realizar? ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite a opção: ");
        int opcao = entrada.nextInt();
                
        if (opcao == 1) {
            float result = n1 + n2;
            System.out.printf("A soma entre %.1f e %.1f é igual a %.1f.", n1, n2, result);
        } else if (opcao == 2) {
            float result = n1 - n2;
            System.out.printf("A subtração entre %.1f e %.1f é igual a %.1f.", n1, n2, result);
        } else if (opcao == 3) {
            float result = n1 * n2;
            System.out.printf("A multiplicação entre %.1f e %.1f é igual a %.1f.", n1, n2, result);
        } else if (opcao == 4) {
            float result = n1 / n2;
            System.out.printf("A divisão de %.1f por %.1f é igual a %.1f.", n1, n2, result);
        } else {
            System.out.println("Opção inválida. Tente novamente!");
        }
    }
}
