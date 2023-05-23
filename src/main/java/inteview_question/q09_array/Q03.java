package inteview_question.q09_array;

import java.sql.Array;
import java.util.Arrays;

public class Q03 {
    public static void main(String[] args) {

        //asagidaki multi dimenasionala arrayin ic elamanlarindaki tum elemanlarin
        // toplamini birer birer bulan ve herbir sonucu yeni bir arraying elemani yapan
        // ve yeni arrayi ekrana yazdirna bir program yazdiriniz. {{1,2,3{,{4,5},{6,7}}

        int arr[][] = {{1, 2, 3}, {4, 5}, {6, 7}};

        int[] sums = new int[arr.length];
        int index = 0;
        int subArraySum = 0;
        for (int[] subArray : arr) {

            for (int num : subArray) {
                subArraySum += num;
            }
            sums[index] = subArraySum;
            index++;
        }

        System.out.println("Sum Array: " + Arrays.toString(sums));

    }
}

