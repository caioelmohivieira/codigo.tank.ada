package exercíciosada;

import java.util.Calendar;
import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Em que dia você nasceu? ");
        int d = entrada.nextInt();
        System.out.println("Em que mês você nasceu? ");
        int m = entrada.nextInt();
        System.out.println("Em que ano você nasceu? ");
        int a = entrada.nextInt();
        Calendar cal = Calendar.getInstance();
        int anoatual = cal.get(Calendar.YEAR);
        int mesatual = cal.get(Calendar.MONTH);
        int diatual = cal.get(Calendar.DAY_OF_MONTH);
        int idade = anoatual -  a;
        int totdias = (idade-1) * 365;
        int totdias1 = totdias + ((mesatual*30) + diatual);
        System.out.println(totdias1);
    }
}
