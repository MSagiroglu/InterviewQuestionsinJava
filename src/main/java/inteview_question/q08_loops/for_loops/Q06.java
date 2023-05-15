package inteview_question.q08_loops.for_loops;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //Kullanıcıdan bir string isteyin bu stringin bir palindrom olup olmadığını kontrol edin...
       palindrome();
    }
    public static void palindrome(){
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String girdi=input.nextLine();
        String reverse="";
        for (int i=girdi.length()-1;i>=0;i--){
            reverse+=girdi.substring(i,i+1);
        }
        System.out.println("Girilen String ifade palindrome mudur : " + (girdi.equals(reverse)));
    }
}
