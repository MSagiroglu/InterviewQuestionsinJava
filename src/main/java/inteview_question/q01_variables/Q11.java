package inteview_question.q01_variables;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan yarıçap isteyip çemberin 
        çevresini ve dairenin alanını hesaplayıp yazdırın
         */
        Scanner input=new Scanner(System.in);
        System.out.println("bir yarıçap değeri giriniz ...");
        double r=input.nextDouble();
        cemberCevre(r);
        daireAlan(r);
        
    }

    private static void daireAlan(double r) {
        double pi=3.14;
        System.out.println("Daire alanı : "+(pi*r*r));
    }

    private static void cemberCevre(double r) {
        double pi=3.14;
        System.out.println("Daire çevresi : "+(pi*2*r));
    }
}
