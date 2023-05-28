package inteview_question.q10_arrayList;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {
    public static void main(String[] args) {
        //B!r tamsayı l!stes!nde 13 öges!nden öncek! tüm l!ste ögeler!n!n toplamını bulunuz.
     List<Integer> arr=new ArrayList<>();
     arr.add(5);
     arr.add(5);
     arr.add(5);
     arr.add(5);
     arr.add(13);
     int idx=0;
     int sum=0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)==13){
                idx=i;
            }
            for (int j = 0; j < idx; j++) {
                sum+=arr.get(j);
            }

        }
        System.out.println(sum);


        //2.way
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        int sum1 = 0;
        for(Integer w : myList){
            if(w==13){
                break;
            }
            sum1 = sum1 + w;
        }
        System.out.println(sum1);


    }
}
