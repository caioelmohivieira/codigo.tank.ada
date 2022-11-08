package exercíciosada;

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Valor do empréstimo: R$ ");
        float c = entrada.nextFloat();
        System.out.print("Quantidade de parcelas: ");
        float t = entrada.nextFloat();
        float i = (float) 0.02;
        float m = (float) (c * Math.pow(1+i, t));
        float parc = m / t;
        System.out.printf("O valor final a ser pago será de R$ %.2f. \n", m);
        System.out.printf("As parcelas ficam no valor de R$ %.2f. \n", parc);
        }
    
}
