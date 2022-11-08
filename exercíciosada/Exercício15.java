package exercíciosada;

import java.util.Scanner;

public class Exercício15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a quantidade de cavalos: ");
        int cavalos = entrada.nextInt();
        int total = cavalos * 4;
        System.out.printf("A quantidade de ferraduras necessárias são: %d. \n", total);
    }
}
