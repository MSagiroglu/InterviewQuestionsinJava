package inteview_question.q01_variables;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan dikdörtgenler prizmasının uzun ,
        kısa kenarlarını ve yüksekliğini isteyip
        prizmanın hacmini hesaplayıp yazdırın
         */
        Scanner input=new Scanner(System.in);
        System.out.println("uzun kenar kisa ve yukseklik");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double h=input.nextDouble();

        prizmaHacim(a,b,h);
    }

    private static void prizmaHacim(double a, double b, double h) {
        System.out.println("Prizma Hacmi = "+ (a*b*h));


    }
}
