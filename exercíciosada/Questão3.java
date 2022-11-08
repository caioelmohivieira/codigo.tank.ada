package exercíciosada;

import java.util.Scanner;

public class Questão3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); 
        System.out.print("Digite o primeiro número: ");
        float num1 = entrada.nextFloat();
        System.out.print("Digite o segundo número: ");
        float num2 = entrada.nextFloat ();
        System.out.println("Escolha qual operação deseja realizar: ");
        System.out.println("Digite 1 para adição;");
        System.out.println("Digite 2 para subtração;");
        System.out.println("Digite 3 para divisão;");
        System.out.println("Digite 4 para multiplicação");
        float opcao = entrada.nextFloat();
        
        if (opcao == 1f) {
            float resultado = num1 + num2;
            System.out.printf("A soma entre %.2f e %.2f é igual a %.2f.", num1, num2, resultado);
        } else if (opcao == 2f) {
            float resultado = num1 - num2;
            System.out.printf("A subtração entre %.2f e %.2f é igual a %.2f.", num1, num2, resultado);
        } else if (opcao == 3f) {
            float resultado = num1 / num2;
            System.out.printf("A divisão entre %.2f e %.2f é igual a %.2f.", num1, num2, resultado);
        } else if (opcao == 4f) {
            float resultado = num1 * num2;
            System.out.printf("A multiplicação entre %.2f e %.2f é igual a %.2f.", num1, num2, resultado);
        } else {
            System.out.println("Opção inválida! Tente novamente!");
        }
    }
}