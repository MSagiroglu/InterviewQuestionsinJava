package inteview_question.q01_variables;
import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 tam sayı alıp bu sayıların toplam fark ve çarpımlarını yazdırın
         */
        Scanner input=new Scanner(System.in);
        System.out.println("2 adet tamsayı giriniz");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("toplam = "+(a+b));
        System.out.println("fark = "+(a-b));
        System.out.println("çarpım = "+(a*b));
    }
}
