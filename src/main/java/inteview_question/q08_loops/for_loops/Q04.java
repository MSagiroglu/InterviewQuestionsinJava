package inteview_question.q08_loops.for_loops;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
        Soru 6) Mülakat Sorusu Kullanıcıdan 100'den küçük bir tamsayı isteyin.
        girilen numara ;
        - Sayı 3'ün katıysa,numarayı "Java" ile değiştirin.
        - Eğer sayı bir ise 5'in katları, sayı yerine "Güzel" yazdırın.
        - Eğer sayı hem 3'ün hem de 5'in katıysa, sayı yerine "Java Güzeldir" yazdırın.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 100'den küçük bir sayı giriniz");
        int girdi = input.nextInt();
        for (int i=1;i<girdi+1;i++){
             if (i%3==0 && i%5==0) {
                System.out.print("Java Güzeldir ");
            } else if (i%5==0) {
                System.out.print("Güzel ");
            } else if (i%3==0) {
                System.out.print("Java ");
            }else {
                System.out.print(i+" ");
            }
        }
    }
}
