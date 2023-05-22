package inteview_question.q08_loops.for_loops;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        //String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
    changetoasterixlowercases();
    }
    public static void changetoasterixlowercases(){
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen adınızı ve soyadınızı giriniz");
        String name=input.nextLine();
        String name2="";
        for (int i = 0; i < name.length(); i++) {
            if (name.substring(i,i+1).replaceAll("[^a-z]","").length()==0){
                name2=name2+name.substring(i,i+1);
            }else name2=name2+"*";
        }
        System.out.println(name2);
    }
}
