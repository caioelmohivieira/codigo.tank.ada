package exercíciosada;

import java.util.Scanner;

public class Exercício9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome do(a) aluno(a): ");
        String nome = entrada.next();
        System.out.print("Digite a primeira nota: ");
        float n1 = entrada.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float n2 = entrada.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float n3 = entrada.nextFloat();
        
        float media = (n1 + n2 + n3) / 3;
        System.out.printf("%s teve média %.2f no semestre. \n", nome, media);
    }
}
