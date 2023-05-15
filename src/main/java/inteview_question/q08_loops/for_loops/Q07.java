package inteview_question.q08_loops.for_loops;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        //Soru 10) Kullanıcıdan iki sayı isteyin. Girilen sayıları ve
        // aralarındaki tüm tamsayıları toplayan programı yazınız.
        System.out.println(toplam());
    }
    public static int toplam(){
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen iki adet sayı giriniz");
        int a=input.nextInt();
        int b=input.nextInt();
        int toplama=0;
        if (a==b){
            return a+b;
        }else if (a>b){
            for (int i=a;i>=b;i--){
                toplama+=i;
            }
        }else {
            for (int i=b;i>=a;i--){
                toplama+=i;
            }
        }
        return toplama;
    }
}
