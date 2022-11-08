package exercíciosada;

import java.util.Scanner;

public class Exercício8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Distância percorrida (Km): ");
        float km = entrada.nextFloat();
        System.out.println("Total de combustível gasto (L): ");
        float litros = entrada.nextFloat();
        float gasto = km / litros;
        System.out.printf("O consumo médio do automóvel é de: %.1f Km/L.", gasto);
    }
}
