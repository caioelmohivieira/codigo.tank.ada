package exercíciosada;

import java.util.Scanner;

public class Questao5 {
    
      public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira temperatura em Celsius: ");
        float temperatura1 = teclado.nextFloat();
        System.out.println("Digite a segunda temperatura em Celsius: ");
        float temperatura2 = teclado.nextFloat();
        final float fator1 = (9 / 5f);
        final int fator2 = 32;
        float fahrenheit1 = ((temperatura1*fator1) + fator2);
        float fahrenheit2 = ((temperatura2*fator1) + fator2);
        System.out.printf("\n A conversão de %.0f ºC para Fahrenheit é: %.1f ºF", temperatura1, fahrenheit1);
        System.out.printf("\n A conversão de %.0f ºC para Fahrenheit é: %.1f ºF \n", temperatura2, fahrenheit2);
          
     }
}



