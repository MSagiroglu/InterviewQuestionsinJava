package inteview_question.q08_loops.for_loops;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        // Kullanicidan 100 den kucuk bir sayi isteyin.
        // 1 den baslayarak girilen sayiya kadar 3 un kati olanm sayilari yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 100'den küçük bir sayı giriniz");
        int girdi = input.nextInt();
        System.out.print("1,");
        for (int i = 1; i < girdi + 1; i++) {
            if (i == girdi && girdi % 3 == 0) {
                System.out.print(i);
            } else if (i == girdi && girdi % 3 != 0) {
                if (girdi % 3 == 2) {
                    System.out.println(girdi - 2);
                } else if (girdi % 3 == 1) {
                    System.out.println(girdi - 1);
                }
            } else if (i % 3 == 0) {
                System.out.print(i + ",");
            }

        }
    }}
