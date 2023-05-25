package inteview_question.q09_array;

import java.util.Arrays;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        //        Kullanıcıdan 2 Str!ng g!rmes!n! !stey!n!z. Str!ngler!n karakterler! ve karakter sayıları aynıysa
//        konsola "Anagramdır" yazdırın. Aks! takd!rde, konsolda "Anagram Deg!l" yazdırınız.
//                Örneg!n; "Mary" ve "army" ve "RAMY" Anagramlardır.

        Scanner input=new Scanner(System.in);
        System.out.println("iki String giriniz :");
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        String a1[] = s1.toLowerCase().split("");
        Arrays.sort(a1);
        String a2[] = s2.toLowerCase().split("");
        Arrays.sort(a2);
        if (s1.length() != s2.length()) {
            System.out.println("Anagram Degil");
        } else if (s1.isEmpty() || s2.isEmpty()) {
            System.out.println("Anagram Degil");
        } else if (Arrays.equals(a1, a2)) {
            System.out.println("Anagramdir");
        } else {
            System.out.println("Anagram Degil");
        }
    }
}
