package inteview_question.q08_loops.for_loops;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
//        Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
//        Örnek; 223878 ==> 37

        System.out.println(uniqueNum());


    }
    public static String uniqueNum(){
        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num=input.nextInt();
        String number=String.valueOf(num);
        String s="";
        for (int i=0;i<number.length();i++){
            String str=number.substring(i,i+1);
            if (number.indexOf(str)==number.lastIndexOf(str)){

                   s+=str;

            }
        }
        return s;
    }
}
