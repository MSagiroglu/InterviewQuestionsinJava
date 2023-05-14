package inteview_question.q01_variables;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan ismini soy ismini alıp baş harflerini ekrana yazdırın
         */
        //1.way
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen isim ve soyisminizi giriniz...");
        String isimSoyisim=input.nextLine();
        String[] arr=isimSoyisim.split(" ");
        if (arr.length==3){
            System.out.println("İsim ve soyisim baş harfleri ; "+arr[0].substring(0, 1) + arr[1].substring(0, 1) + arr[2].substring(0, 1));
        } else if (arr.length==2){
            System.out.println("İsim ve soyisim baş harfleri ; "+arr[0].substring(0, 1) + arr[1].substring(0, 1) );
        }


        //2.WAY sadece bir ad ve bir soyad icin


        System.out.println(isimSoyisim.substring(0,1) + isimSoyisim.split(" ")[1].substring(0,1));

    }
}
