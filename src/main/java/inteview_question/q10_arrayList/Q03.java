package inteview_question.q10_arrayList;

import java.util.ArrayList;
import java.util.List;

public class Q03 {
    public static void main(String[] args) {

        // L!stede eleman olarak 15 varsa, tüm 15'ler! 51 olarak deg!st!r!n!z.
        // Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43)
        List<Integer> g = new ArrayList<>();
        g.add(12);
        g.add(11);
        g.add(15);
        g.add(34);
        g.add(15);
        g.add(43);

        int z = 15;
        System.out.println(g.indexOf(z));
        System.out.println(g.indexOf(15));
        int counter =0;
        if (g.contains(15)) {
            for (int w : g) {


                if (w == 15) {
                    //   g.set(counter, 51);  ikinci yol olarak counter ile yapabiliriz.
                    int idx = g.indexOf(15);
                    g.set(idx, 51);

                }
                //   counter++;
            }
            System.out.println(g);
        } else {
            System.out.println("liste 15 elemanıini icermiyor");
        }
    }
}

