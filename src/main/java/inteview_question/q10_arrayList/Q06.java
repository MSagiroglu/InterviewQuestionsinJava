package inteview_question.q10_arrayList;

import java.util.ArrayList;
import java.util.List;

public class Q06 {
    public static void main(String[] args) {
       //Str!ng b!r l!stede ver!len tüm f!yatların toplamını bulunuz.
       //Örnek: L!st<Str!ng> myL!st = new L!st<Str!ng>{'$12.99', '$23.60', '$54.45'}; ==> 91.04
        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");
        double sum = 0;
        for(String w : myList){
            Double price = Double.valueOf(w.replace("$", ""));
            sum = sum + price;
        }
        System.out.println(sum);
    }
}
