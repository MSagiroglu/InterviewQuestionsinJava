package inteview_question.q05_ifstatements;

public class Q01 {
    public static void main(String[] args) {
      /*  Scanner scan = new Scanner(System.in);
        int sayi=scan.nextInt();
        String sr=(sayi<1000 && sayi>99) ? "Sayı 3 basamaklıdır" : "3 basamaklı sayı değildir";
        System.out.println(sr);
        System.out.println("yıl giriniz");
        int yil=scan.nextInt();
        if (yil%4==0){
            if (yil%100!=0){
                System.out.println("girilen yıl artık yıldır");
            } else if (yil%400==0) {
                System.out.println("girilen yıl artık yıldır");
            }else System.out.println("artık yıl değildir");

        }else System.out.println("girilen yıl artık yıl değildir");
        System.out.println(gunIsmı("ç"));
        //Example-2:Kullanıcıdan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadığını yazdırın

        //1.way
        String ch = scan.next();
        int c = ch.trim().replaceAll("[^A-Za-z]", "").length();
        if (c > 0) {
            System.out.println("Girilen karakter bir harftir");
        } else {
            System.out.println("Girilen karakter bir harf değildir");
        }
        //2.way
        System.out.println("bir karakter giriniz");
        char s = scan.next().charAt(0);

        if(s>='A' && s<='z'){
            System.out.println("girdiniz harf");
        }else{
            System.out.println("harf degil");
        }*/

        //Example 3:
        // ABD'deki eyaleBt kısaltmalarının biçimini kontrol etmek için kod yazınız.
        //a) Kısaltma 2'den fazla karakter içeriyor ise kodunuz, "Eyalet kısaltmaları 2 karakterden fazla olamaz" yazmalıdır.
        //b) Kısaltmada küçük harfler var ise kodunuz, "Eyalet kısaltmaları küçük harf içeremez" yazmalıdır.
        //c) Kısaltmanın harflerinden farklı karakterler var ise kodunuz, "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez" yazmalıdır.
        //Not: Kısaltmada 1'den fazla hata varsa ilgili tüm hata mesajları yazdırılmalıdır.
        //örnek; "fl3" için kodunuz; "Eyalet kısaltmaları 2 karakterden fazla olamaz", "Eyalet kısaltmaları
        //küçük harf içeremez", ve "Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez"
        //yazmalıdır
        String kisaltma="A3";
        if(kisaltma.length()>2){
            System.out.println("Eyalet kısaltmaları 2 karakterden fazla olamaz");
        }
        if (kisaltma.replaceAll("[^a-z]","").length()>0){
            System.out.println("Eyalet kısaltmaları küçük harf içeremez");
        //veya
            if (!kisaltma.equals(kisaltma.toUpperCase())){
            System.out.println("Eyalet kısaltmaları küçük harf içeremez");
        }

        }
        if (kisaltma.replaceAll("[a-zA-Z]","").length()>0){
            System.out.println("Eyalet kısaltmaları aşağıdakilerden farklı karakterler içeremez");
            System.out.println(kisaltma.replaceAll("[^A-Z]", "").charAt(0) + " " + kisaltma.replaceAll("[^A-Z]", "").charAt(1));
        }


    }

    public static String gunIsmı(String s) {
        if (s.equalsIgnoreCase("P")) {
            return "pazartesi,perşembe,pazar";
        } else if (s.equalsIgnoreCase("s")) {
            return "Salı";
        } else if (s.equalsIgnoreCase("ç")) {
            return "Çarşamba";
        } else if (s.equalsIgnoreCase("c")) {
            return "Cuma,Cumartesi";
        } else return "Geçersiz bir harf girdiniz";
    }
}