package exercíciosada;

import java.util.Scanner;

public class Questão2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    float num = 7;
    float num1 = 4;
    float num2 = 7;
    
    if (num == 0 && num1 == 0) {
        System.out.print("Não há parâmetros predefinidos. Digite o primeiro número: ");
        float num3 = entrada.nextFloat();
        System.out.print("Digite o segundo número: ");
        float num4 = entrada.nextFloat();
        float resultado = num3 + num4;
        System.out.printf("A soma entre %.1f e %.1f é igual a %.1f.", num3, num4, resultado);
    } else if (num == 0 && num1 > 0){
        System.out.printf("Falta um parâmetro. Digite um número para somar com %.1f: ", num1);
        float num3 = entrada.nextFloat();
        float resultado = num1 + num3;
        System.out.printf("A soma entre %.1f e %.1f é igual a %.1f.", num1, num3, resultado);
    } else if (num1 == 0 && num > 0) {
        System.out.printf("Falta um parâmetro. Digite um número para somar com %.1f: ", num);
        float num3 = entrada.nextFloat();
        float resultado = num + num3;
        System.out.printf("A soma entre %.1f e %.1f é igual a %.1f", num, num3, resultado);
    } else if (num2 > 0) {
        System.err.println("ERRO! A quantidade é inválida!");
    } else {
        float resultado = num + num1;
        System.out.printf("A soma entre %.1f e %.1f é igual a %.1f.", num, num1, resultado);
        }
  }
}
