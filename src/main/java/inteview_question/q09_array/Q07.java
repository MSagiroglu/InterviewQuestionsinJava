package inteview_question.q09_array;

import java.util.Arrays;
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        //Tamsayılardan olusan b!r arrayde ortadak! elemanı bulunuz.
        //Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        //(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10
        centerNum();

    }
    public static void centerNum(){
        int arr[] = {12, 5, 8, 13,25};
        Arrays.sort(arr);
        int idx;
        if (arr.length%2!=0){
            idx=((arr.length)/2)+1;
            System.out.println(arr[idx]);
        }else {
            int result = (arr[arr.length/2] + arr[arr.length/2-1])/2;
            System.out.println(result);
        }
    }
}
