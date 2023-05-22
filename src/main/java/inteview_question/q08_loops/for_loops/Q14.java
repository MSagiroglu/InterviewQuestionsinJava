package inteview_question.q08_loops.for_loops;

public class Q14 {
    public static void main(String[] args) {
//        Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
//        işaretiyle yazdırmak için gereken kodu yazınız.
//        Örneğin; 75.4238 ´ *4*2*3*8

        double num = 75.4238;
        //String s = String.valueOf(num); veya
        String s="";
        s=s+num;
        int idxOfComma = s.indexOf(".");
        String decimalPart = s.substring(idxOfComma + 1);
        String t = "";
        for(Integer i=0; i<decimalPart.length(); i++){
            String r = decimalPart.substring(i,i+1);
            t = t + "*" + r;
        }
        System.out.println(t);
    }
}
