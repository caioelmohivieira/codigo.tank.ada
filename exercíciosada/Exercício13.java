package exercíciosada;

import java.util.Scanner;

public class Exercício13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o custo de fábrica do veículo: R$ ");
        float custo = entrada.nextFloat();
        float custofinal = custo + (custo * 0.28f) + (custo * 0.45f); 
        System.out.printf("O custo final do veículo será de R$ %.2f \n", custofinal);
    }
}
