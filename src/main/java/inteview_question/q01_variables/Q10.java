package inteview_question.q01_variables;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan karenin bir kenar uzunluğunu alın
         ve karenin çevresini ve alanını hesaplayıp yazdırın
         */
        Scanner input=new Scanner(System.in);
        System.out.println("karenin kenarini giriniz");
        int a = input.nextInt();

        kareninCevresi(a);
        kareninAlani(a);

    }

    private static void kareninAlani(int a) {
        System.out.println("Karenin alani = " + (a*a));
    }

    private static void kareninCevresi(int a) {
        System.out.println("Karenin cevresi = " + (4*a));
    }

    }
