package inteview_question.q10_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q02 {
    public static void main(String[] args) {

        //B!r l!stedek! ögeler!n azalan sırada olup olmadıgını kontrol ed!n!z.
        //Örnek: (Sarı, Mav!, Kırmızı, Yes!l) ==> Çıktı: Azalan sırada deg!l
        //(Sarı, Kırmızı, Yes!l, Mav!) ==> Çıktı: Azalan sıradadır

        List<String> e = new ArrayList<>();
        e.add("Yellow");
        e.add("Red");
        e.add("Green");
        e.add("Blue");

        List<String> f = new ArrayList<>();
        f.addAll(e);



        Collections.sort(f);
        System.out.println("***** " + f);
        Collections.reverse(f);
        System.out.println("***** " + f);



        System.out.println("boolean : " + f.equals(e));


        //2.yol
        System.out.println(e);
        System.out.println(f);
        int size = e.size();
        int flag = 0;
        for(int i=0; i<size; i++){
            if(f.get(i).equals(e.get(size-1-i))){
                flag++;
            }
        }
        if(flag == size){
            System.out.println("Azalan siradadir");
        }else{
            System.out.println("Azalan sirada degil");
        }
    }
}

