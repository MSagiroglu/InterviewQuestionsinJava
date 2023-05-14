package inteview_question.q07_switchcase;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {



/*
Sw!tch !fades!n! kullanarak, herhang! b!r 2 sayıyla toplama, çıkarma, çarpma ve bölme
yapan bas!t b!r hesap mak!nes! olusturmak !ç!n kod yazınız.
a) Kullanıcı 10.2 ve 5 ve + !saret!n! g!rd!g!nde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
b) Kullanıcı 10 ve 5 ve - !saret!n! g!rd!g!nde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
c) Kullanıcı 10 ve 5.3 ve * !saret!n! g!rd!g!nde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
d) Kullanıcı 10 ve -5 ve / !saret!n! g!rd!g!nde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
e) Kullanıcı 10 ve -5 g!rd!g!nde +, -, *, / 'den farklı b!r !slem yaptıgında kodunuz "Geçers!z Islem"
yazmalıdır.
 */

        hesapla();

    }
    public static void hesapla (){
        Scanner input = new Scanner(System.in);
        System.out.println("Islemi gir" + "\n +,-,*,/,%");
        char islem=input.next().charAt(0);
        System.out.println(" islem yapacak oldugunuz iki adet sayi giriniz");
        double a=input.nextDouble();
        double b=input.nextDouble();

        switch (islem){
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a -b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            case '%':
                System.out.println(a*b/100);
                break;
            default:
                System.out.println("gecersiz islem girdiniz");
        }


    }
}
