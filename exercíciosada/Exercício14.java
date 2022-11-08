package exercíciosada;

import java.util.Scanner;

public class Exercício14 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do raio: ");
        float raio = entrada.nextFloat();
        float area = (float) (3.14159235659 * Math.pow(raio, 2));
        System.out.printf("A área do círculo é: %.1f m. \n", area);
    }
 
}
