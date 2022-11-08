package exercíciosada;

import java.util.Scanner;

public class Exercício16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Nome do aluno: ");
        String nome = entrada.next();
        System.out.print("Digite a turma: ");
        String turma = entrada.next();
        System.out.print("Digite a primeira nota: ");
        float nota1 = entrada.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = entrada.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float nota3 = entrada.nextFloat();
        float media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("A média do aluno %s da turma %s é de %.1f. \n", nome, turma, media);
    }
}
