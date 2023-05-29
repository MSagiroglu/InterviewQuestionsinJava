package inteview_question.q10_arrayList;

import java.util.ArrayList;
import java.util.List;

public class Q05 {
    public static void main(String[] args) {
        // L!stedek! 7 ve 10 dısındak! her ögen!n deger!n! 2'ser artırınız.
        // Örnek: (12, 31, 7, 13, 10) ==> Çıktı (14, 33, 7, 15, 10)
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(7);
        h.add(13);
        h.add(10);

        //1.Çözüm
        for (int i = 0; i < h.size(); i++) {
            if (h.get(i)==7 || h.get(i)==10){
                continue;
            }
            h.add(i,h.get(i)+2);
            h.remove(i+1);
        }

        //2,çözüm
        for(Integer w : h){
            if(w==7 || w==10){
                continue;
            }

           h.set(h.indexOf(w),w+2);
        }
        System.out.println(h);
    }
}
