package exercíciosada;

import java.util.Scanner;


public class Exercício2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da massa em Kg: ");
        float m = entrada.nextFloat();
        System.out.println("Digite o valor da altura: ");
        float h = entrada.nextFloat();
        System.out.println("Digite o tempo em segundos: ");
        float t = entrada.nextFloat();
        float resultado = (float) (((m*h)/t) / 745.6999);
        System.out.println("A quantidade de cavalos é de: " + resultado);
    }
}