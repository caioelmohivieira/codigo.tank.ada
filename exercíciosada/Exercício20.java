package exercíciosada;

import java.util.Scanner;

public class Exercício20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Tempo gasto na viagem: ");
        float tempo = entrada.nextFloat();
        System.out.print("Velocidade média: ");
        float vel = entrada.nextFloat();
        float distancia = tempo * vel;
        float litros = distancia / 12;
        System.out.printf("A quantidade de combustível necessária é de %.1f litros.", litros);
    }
}
