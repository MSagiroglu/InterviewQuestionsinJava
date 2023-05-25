package inteview_question.q09_array;

import java.util.Arrays;

public class Q09 {
    public static void main(String[] args) {
        /*
        Tamsayılardan olusan b!r arrayde en küçük poz!t!f elemanı ve en büyük negat!f elemanı
        bulunuz.
        Örnek:(-12, 18, -5, 23, -2) ==> En küçük poz!t!f 18, en büyük negat!f -2
         */
        //1. Yol:
        int[] a = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(a);
        Integer minPositive = a[a.length - 1];
        Integer maxNegative = a[0];
        for (Integer w : a) {
            if (w >= 0) {
                minPositive = Math.min(minPositive, w);
            }
            if (w < 0) {
                maxNegative = Math.max(maxNegative, w);
            }
        }
        System.out.println("Minimum positive: " + minPositive);
        System.out.println("Maximum negative: " + maxNegative);
        //2. Yol:

        Arrays.sort(a);
        for (Integer i = 0; i < a.length; i++) {
            if (a[i] < 0 && a[i + 1] > 0) {
                System.out.println("Maximum negative: " + a[i]);
                System.out.println("Minimum positive: " + a[i + 1]);
            }
        }
    }
}
