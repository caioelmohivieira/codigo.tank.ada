package exercíciosada;

import java.util.Scanner;

public class ExercíciosAda {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        float temperatura = teclado.nextFloat();
        System.out.format("\n Kelvin = " + (temperatura + 273.15));
        System.out.format("\n Fahrenheit = " + ((temperatura * 1.8) + 32));
        System.out.format("\n Rankine = " + ((temperatura * 1.8) + 32 + 459.67));
        System.out.format("\n Réaumur = " + (temperatura * 0.8));
    }
    
}
