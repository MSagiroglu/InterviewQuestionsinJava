package inteview_question.q09_array;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        /*
        kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
         */
        wordNum();
    }
    public static void wordNum (){
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz.");
        String sentence=input.nextLine();
        String arr[]=sentence.split(" ");
        System.out.println();
        System.out.println("Cümlenin içerisinde "+arr.length+" adet kelime vardır.");
    }
}
