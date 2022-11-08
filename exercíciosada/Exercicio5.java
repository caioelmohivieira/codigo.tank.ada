package exercíciosada;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor do salário: ");
        float sal = entrada.nextFloat();
        float salfinal = sal + (sal * 0.07f);
        System.out.printf("O salário de R$ %.2f ficará no valor de R$ %.2f. \n", sal, salfinal);
    }
}
