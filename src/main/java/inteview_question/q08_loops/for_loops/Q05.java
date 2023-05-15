package inteview_question.q08_loops.for_loops;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        //Ex 1:Kullanıcıdan bir String isteyin ve onu tersten yazdırın
        //1.yol
        String str = "Ali";

        for(int i = str.length()-1; i>=0; i--){
            char c=str.charAt(i);
            System.out.print(c);
        }
        System.out.println("************************");
        //2. yol
        StringBuilder strYeni = new StringBuilder(str);
        System.out.println(strYeni.reverse());
        //3.yol
        reverse();

    }

    public static void reverse(){
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String girdi=input.nextLine();
        String reverse="";
        for (int i=girdi.length()-1;i>=0;i--){
            reverse+=girdi.substring(i,i+1);
        }
        System.out.println(reverse);
    }
}
