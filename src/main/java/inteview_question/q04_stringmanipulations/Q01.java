package inteview_question.q04_stringmanipulations;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*
         Sadece tek bir kelimeden oluşan şehir isimleri
         için bir String değişkeni oluşturun. Şehir
        ismini, baş harfi büyük ve diğer tüm
        karakterleri küçük  harfler olacak şekilde konsolda
        yazdırınız.
         */
        String i="izmir";
        System.out.println(i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase());


        /*
        Kişi isimleri için 3 String değişken oluşturunuz.
        Boşluk karakterleri hariç 3 isimdeki
        karakter sayısının toplamını yazdırınız
         */

        String a="Al i" , b="ve li",c="Ca n";
        System.out.println(a.replaceAll(" ", "").length() +
                b.replaceAll(" ", "").length() +
                c.replaceAll(" ", "").length());

        /*
        Bir String değişkeni oluşturunuz, String'deki toplam
        alfabetik ve sayısal karakter sayısını konsolda yazdırınız.
        Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
         */

        String t="a1. ^%+%&%&";
        System.out.println(t.replaceAll("[^A-Za-z0-9]", "").length());
        System.out.println(t.replaceAll("\\W", "").length());
        System.out.println(t.replaceAll("\\w", "").length());
        System.out.println(t.replaceAll("\\p{Punct}", "").length());


        /*
        Bir String değişkeni oluşturunuz, String'deki rakam olmayan
         karakterlerin sayısını konsolda yazdırınız
         */
        String s="1234 =(/&asdf";
        System.out.println(s.replaceAll("\\d", "").length());
        System.out.println(s.replaceAll("[0-9]", "").length());




            //B!r Str!ng deg!sken! olusturunuz ve Str!ng deg!sken!n konsolda bosluk olmayan son
            //karakter! yazdırınız.

            String a1 = "ERol  ";

            System.out.println(a1.substring(a1.trim().length()-1));


            //B!r Str!ng deg!sken! olusturunuz ve Str!ng'!n !lk ve son karakterler!n!n ASCII degerler!n!n
            //toplamını bulunuz.
            String a2 = "Zr ol.";

            char c2 = a2.charAt(0);
            char d = a2.charAt(a2.length()-1);

            System.out.println(c2+d);



            //B!r Str!ng deg!sken! olusturunuz ve !lk karakter! dısındak! tüm karakterler! konsolda
            //yazdırınız.

            System.out.println(a2.substring(1));




            //B!r Str!ng deg!sken! olusturunuz ve son karakter! dısındak! tüm karakterler!n! konsolda
            //büyük harfle yazdırınız.

            System.out.println(a2.substring(0, a2.length() - 1).toUpperCase() + a2.substring(a2.length() - 1) );




            //B!r Str!ng deg!sken! olusturunuz ve konsolda !lk karakter ve son karakter dısındak! tüm
            //karakterler! büyük harflerle yazdırınız.

            System.out.println(a2.substring(0, 1) + a2.substring(1, a2.length() - 1).toUpperCase() + a2.substring(a2.length() - 1));


            //B!r Str!ng !n ortadak! herhang! b!r konumda yalnızca tek b!r bosluk karakter! olup
            //olmadıgını kontrol etmek !ç!n kod yazınız.

            System.out.println(a2.trim().contains(" "));
            System.out.println("*****" + a2.trim().isBlank());

            System.out.println(a2.trim().replaceAll("\\S", "").isBlank());  // "[^ ]"
            System.out.println((a2.trim().replaceAll("\\S", "").length())==1);  // "[^ ]"

            //B!r Str!ng’ !n basında ve sonunda bosluk karakter! olup olmadıgını kontrol etmek !ç!n kod
            //yazınız.
            System.out.println(a2.substring(0, 1).contains(" ") + " " + a2.substring(a2.length() - 1).contains(" "));
            System.out.println(a2.startsWith(" ") + " " + a2.endsWith(" "));

            //B!r Str!ng’ !n basında büyük harf ve sonunda nokta olup olmadıgını kontrol etmek !ç!n kod
            //yazınız.
            System.out.println(a2.endsWith("."));

            char z = a2.charAt(0);
            System.out.println((z >= 'A' && z <= 'Z'));

        //Kullanıcıdan bir cümle ve bir kelime isteyin kelimenin cümledeki kullanımına bakarak aşağıdaki üç cümleden uygun olanını yazdırın
        //1 girilen kelime cümlede kullanılmamış 2 girilen kelime cümlede bir kere kullanılmış 3 girilen kelime cümlede birden fazla kullanılmış
            Scanner input=new Scanner(System.in);
            String  cumle=input.nextLine();
            String bul="güzel";
            if(cumle.contains(bul)==false){
                System.out.println("Cümle içerisinde aradığınız kelime yoktur");
            } else if (cumle.indexOf(bul)==cumle.lastIndexOf(bul)){
                System.out.println("Cümle içerisinde aradığınız kelime 1 kere kullanılmıştır");
            }else if (cumle.indexOf(bul)!=cumle.lastIndexOf(bul)) {
                System.out.println("Cümle içerisinde aradığınız kelime 1'den fazla kullanılmıştır");
            }

            //String metotlarını kullanarak "Java ogrenmek123 Cok guzel@" stringini Java ogrenmek cok güzel şekline getirin
            String r=" Java ogrenmek123 Cok guzel@ ";
            System.out.println(r.trim().substring(0,1)+r.trim().replaceAll("[^A-Za-z ]", "").substring(1).toLowerCase());
            //String şeklinde verilen aşağıdaki fiyatların toplamını bulunuz
            String p="$35.54";
            String u="$30.49";
            p=p.replace("$","");
            u=u.replace("$","");
            double x=Double.parseDouble(p)+Double.parseDouble(u);
            double y=Double.valueOf(p)+Double.valueOf(u);
            System.out.println(x);
             System.out.println(y);

        System.out.println("isim ve soy isminizi ayrı ayrı giriniz.");
        String isim=input.next();
        //String soyIsim=input.next();
       String ad= isim.split( " ")[0];
       String soyad= isim.split( " ")[1];
        if(ad.length()>soyad.length()){
            System.out.println(ad);
        }else{
            System.out.println(soyad);
        }

    }
    }


