package inteview_question.q09_array;

import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {
//        Tamsayılardan olusan arrayde bulunan sıfırları, array sonuna yerlest!ren kod yazınız.
//        Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)
        int[] arr = new int[]{5, 0, 2, 0, 3};
        int[] brr = new int[arr.length];
        int firstIdx = 0;
        int lastIdx = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                brr[firstIdx] = arr[i];
                firstIdx++;
            }else{
                brr[lastIdx]=0;
                lastIdx--;
            }

        }
        System.out.println(Arrays.toString(brr));

        System.out.println("***********************************");

        Integer[] crr = new Integer[arr.length];
        int idx = 0;
        for (int w : arr) {
            if (w != 0 ) {
                crr[idx] = w;
                idx++;
            }
        }
        for (int w : arr){
            if(w==0){
                crr[idx]=w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(crr));
    }
    }

