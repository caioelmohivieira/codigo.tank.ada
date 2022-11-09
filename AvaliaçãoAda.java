package avaliaçãoada;

import java.util.Scanner;

public class AvaliaçãoAda {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("UNIDADES DE TEMPERATURA:");
        System.out.println("1 - Celsius");
        System.out.println("2 - Kelvin");
        System.out.println("3 - Fahrenheit");
        System.out.print("Digite a temperatura a ser transformada: ");
        float temp = entrada.nextFloat();
        System.out.print("Digite a unidade de origem da temperatura: ");
        int temp1 = entrada.nextInt();
        System.out.print("Digite a unidade a ser transformada: ");
        int temp2 = entrada.nextInt();
        
        if (temp1 == 1 && temp2 == 2) {
            float celsius = temp + 273.15f;
            System.out.printf("A conversão de %.1f ºC em Kelvin é: %.1f ºK.", temp, celsius);
        } else if (temp1 == 1 && temp2 ==3) {
            float celsius1 = (float) (temp * 1.8) + 32;
            System.out.printf("A conversão de %.1f ºC em Fahrenheit é: %.1f ºF.", temp, celsius1);
        } else if (temp1 == 2 && temp2 == 1) {
            float kelvin1 = temp - 273.15f;
            System.out.printf("A conversão de %.1f ºK em Celsius é: %.1f ºC.", temp, kelvin1);
        } else if (temp1 == 2 && temp2 == 3) {
            float kelvin2 = ((temp - 273.15f) * 1.8f) + 32;
            System.out.printf("A conversão de %.1f ºK em Fahrenheit é: %.1f ºF.", temp, kelvin2);
        } else if (temp1 == 3 && temp2 == 1) {
            float fah = (temp - 32) * 0.5555f;
             System.out.printf("A conversão de %.1f ºF para Celsius é: %.1f ºC.", temp, fah);
        } else if (temp1 == 3 && temp2 == 2) {
            float fah1 = (temp - 32) * 0.5555f + 273.15f;
            System.out.printf("A conversão de %.1f ºF para Kelvin é: %.1f ºK.", temp, fah1);
        } else {
            System.err.println("Opção inválida. Tente novamente!");
        }
    }
    
}
