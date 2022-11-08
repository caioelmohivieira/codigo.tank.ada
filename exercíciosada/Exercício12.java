package exercíciosada;

import java.util.Scanner;

public class Exercício12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o preço de custo do produto: R$ ");
        float custo = entrada.nextFloat();
        System.out.print("Digite o percentual de ganho desejado (%): ");
        float perc = entrada.nextFloat();
        float perc1 = (perc * custo) / 100;
        float tot = custo + perc1;
        System.out.printf("O valor de venda será de R$ %.2f. \n", tot);
    }
}
