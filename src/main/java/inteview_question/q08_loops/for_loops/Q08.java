package inteview_question.q08_loops.for_loops;

public class Q08 {
    public static void main(String[] args) {
        //120'den 11'e kadar 4 !le bölüneb!len ve 6 !le bölüneb!len tüm tam sayıları aynı satırda !k!
        //        ardısık tam sayı arasında "," bırakarak yazınız.
        //1. Yol:
        String s = "";
        for(int i=120; i>10; i--){
            if(i%4==0 && i%6==0){
                s += i + ",";
            }
        }
        s=s.substring(0,s.length()-1);// son virgülü kaldırmak için.
        System.out.println(s);
    }
}
