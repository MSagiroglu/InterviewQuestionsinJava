package inteview_question.q10_arrayList;

import java.util.ArrayList;
import java.util.List;

public class Q08 {
    public static void main(String[] args) {
        //Döngüler! kullanarak tamsayılardan olusan b!r l!sten!n tüm ögeler!n!n benzers!z (tekrarsız)
        //olup olmadıgını kontrol ed!n!z.
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(23);
        Integer counter = 0;

        for (Integer w : myList) {
            for (Integer k : myList) {
                if (w == k) {
                    counter++;
                }
            }
        }
        if (counter == myList.size()) {
            System.out.println("Tekrarlanan oge yoktur");
        } else {
            System.out.println("En az 1 oge tekrarlanmistir");
        }
    }
}
