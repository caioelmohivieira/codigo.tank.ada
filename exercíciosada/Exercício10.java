package exercíciosada;

import java.util.Scanner;

public class Exercício10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual o valor depositado: R$ ");
        float valor = entrada.nextFloat();
        float rend = (valor * 0.007f);
        float total = valor + rend;
        
        System.out.printf("Após 1 mês depositado, o valor de R$ %.2f gera um rendimento de R$ %.2f, ficando no total de R$ %.2f. \n", valor, rend, total);
    }
}
