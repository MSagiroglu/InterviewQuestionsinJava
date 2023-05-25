package inteview_question.q09_array;

import java.util.Arrays;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan aldıgınız tamsayılar !le b!r array olusturunuz ve bu arraydek! en küçük ve en
        büyük ögeler arasındak! farkı konsolda yazdırınız.
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Sayılar giriniz. Çıkmak için q'ya basınız");
        String s="";
        String t="";
        int idx=0;
        do {
            t=input.next();
            if (t.equals("q")){
                break;
            }else {
                s+=t+" ";
                idx++;
            }
        }while (true);
        String arr[]=s.split(" ");
        int min=Integer.valueOf(arr[0]);
        int max=Integer.valueOf(arr[0]);


        for (int i = 0; i <arr.length; i++) {
            min=Math.min(min,Integer.valueOf(arr[i]));
            max=Math.max(max,Integer.valueOf(arr[i]));
        }
        System.out.println(max+"-"+min +"="+(max-min));


        //2. yol:
        System.out.println("Array uzunlugunu giriniz : ");
        int len = input.nextInt();
        int ar[] = new int[len];
        System.out.println("Girilen array elemanlari : " + len);
        for(int i=0; i<len; i++) {
            ar[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(ar));
        Arrays.sort(ar);
        System.out.println(Arrays.toString(ar));
        int diffOfBigAndSmall = ar[ar.length-1] - ar[0];
        System.out.println("En buyuk ve en kucuk oge arasındaki fark : " + diffOfBigAndSmall);

    }



    }

