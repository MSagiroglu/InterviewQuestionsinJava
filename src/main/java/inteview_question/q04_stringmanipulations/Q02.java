package inteview_question.q04_stringmanipulations;

import java.util.List;
import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        //EX 01:Kullanıcıdan isim ve soy ismini isteyin ve hangisinin daha uzun olduğunu yazdırın
        Scanner input = new Scanner(System.in);
        System.out.println("isim ve soy isminizi ayrı ayrı giriniz.");
        String isim = input.nextLine();
        //String soyIsim=input.next();
        String ad = isim.split(" ")[0];
        String soyad = isim.split(" ")[1];
        if (ad.length() > soyad.length()) {
            System.out.println(ad);
        } else {
            System.out.println(soyad);
        }

        //Ex 02:Kullanıcıdan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("4 harfli kelime");
        String s = scan.next();

        String str = "";
        //1.Way forloop cozum

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            //  str = str + s.substring(i, i+1);


            System.out.print(ch);

        }
        //  System.out.println(str);

        System.out.println();

        //2.Way stringbuilder

        StringBuilder sbl = new StringBuilder(s);
        System.out.println(sbl.reverse());


        System.out.println("***************");

        List<String> lst = List.of(s.split(""));
        // lst.stream().map(StringBuilder::reverse()).forEach(System.out::print);


        System.out.println("giriş yapın");


        do {
            String input2 = scan.nextLine();

            boolean x = input2.substring(0, 1).replace("[^a-z]", "").length() > 0 &&
                    input2.substring(input2.length() - 1).replace("[^a-z]", "").length() > 0 &&
                    !input2.contains(" ") &&
                    input2.length() > 7;
            if (x) {
                System.out.println("sorun yok");
                break;
            } else {
                System.out.println("sorunlu, tekrar girin");
            }
        }

            while (true);


        // Ex 03:kullanicidan adini soyadini alin ve krefdi karti bilgilerini alin asagidaki gibi yazdirin

        //  M***** S*****
        //  **** **** **** 1234

        System.out.println("Adini soyadinizi girin");
        String bos = scan.nextLine();//dummy
        String adSoyad = scan.nextLine();
        System.out.println("banka kart nosunu giirn");
        String bankKart = scan.nextLine();


        String yeniAd = (adSoyad.split(" ")[0].substring(0,1).toUpperCase() )+ (adSoyad.split(" ")[0].substring(1).replaceAll("[A-Za-z]","*" ));
        String yeniSoyad = (adSoyad.split(" ")[1].substring(0,1).toUpperCase() )+ (adSoyad.split(" ")[1].substring(1).replaceAll("[A-Za-z]","*" ));

        String yeniBankKart = "**** **** ****  " + bankKart.substring(bankKart.length()-4);

        System.out.println(yeniAd + " " + yeniSoyad + "\n" + yeniBankKart);

        // System.out.println(yeniAd + " " + yeniSoyad );
    }
}


