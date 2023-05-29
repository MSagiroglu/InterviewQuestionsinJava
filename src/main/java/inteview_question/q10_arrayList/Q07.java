package inteview_question.q10_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q07 {
    public static void main(String[] args) {
//        B!r Str!ng l!stes!nde ver!len en düsük ve en büyük f!yatın toplamını bulunuz.
//        Örnek: L!st<Str!ng> myL!st = new L!st<Str!ng>{'$12.99', '$8.25', '$23.60', '$54.45'}; ==> 62.70
        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$8.25");
        myList.add("$54.45");
        List<Double> decimalList = new ArrayList<>();
        for(String w : myList){
            Double price = Double.valueOf(w.replace("$", ""));
            decimalList.add(price);
        }
        Collections.sort(decimalList);
        Double sum = decimalList.get(0) + decimalList.get(decimalList.size()-1);
        System.out.println(sum);
    }
}
