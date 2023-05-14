package inteview_question.q07_switchcase;

import java.util.Random;

public class Q04 {
    public static void main(String[] args) {

        /*
        myClass !sm!nde b!r class olusturunuz, class'ta s!ze rastgele b!r alfabet!k karakter veren b!r
yöntem olusturun ve ardından yöntem! kullanarak asagıdak!ler! yazdırınız.
'A' ve 'a' !ç!n "Ilk Karakter" yazdırınız.
'B' ve 'b' !ç!n "Ik!nc! Karakter" yazdırınız.
'C' ve 'c' !ç!n "Üçüncü Karakter" yazdırınız.
'D' ve 'd' !ç!n "Dördüncü Karakter" yazdırınız.
D!gerler! !ç!n "D!ger Karakterler!" yazdırınız.
         */

        //1. YOL
        Random rnd = new Random();
        int x = 0;
        do {

            x = rnd.nextInt((122 - 65 + 1)) + 65;
            System.out.println((char)x);

        } while (x >= 91 && x <= 96);



        switch ((char) x) {
            case 'A':
            case 'a':
                System.out.println("Ilk karakter =" + (char) x);
                break;
            case 'B':
            case 'b':
                System.out.println("2. karakter=" + (char) x);
                break;
            case 'C':
            case 'c':
                System.out.println("3. karakter=" + (char) x);
                break;
            case 'D':
            case 'd':
                System.out.println("4. karakter=" + (char) x);
                break;
            default:
                System.out.println("diger karakterler=" + (char) x);
        }



        String alfabe = Q04.getRandomAlphabet().toLowerCase();
        switch(alfabe){
            case "a":
                System.out.println("Ilk Karakter");
                break;
            case "b":
                System.out.println("Ikinci Karakter");
                break;
            case "c":
                System.out.println("Ucuncu Karakter");
                break;
            case "d":
                System.out.println("Dorduncu Karakter");
                break;
            default:
                System.out.println("Diger Karakterler");
        }
    }
    // 2. YOL METHOD İLE ÇÖZÜM
    public static String getRandomAlphabet(){
        String alfabe = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIndex = alfabe.length()-1;
        int randomIndex = (int)Math.round(Math.random()*maxIndex);
        return alfabe.substring(randomIndex, randomIndex+1);
    }
}





