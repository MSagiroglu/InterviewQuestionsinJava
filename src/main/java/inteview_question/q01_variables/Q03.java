package inteview_question.q01_variables;

public class Q03 {
    public static void main(String[] args) {
        /*
        Basit faizi bulmak için bir kod yazınız.
        Not: Basit faiz formülü = anapara * oran * yılDegeri /100
         */
        System.out.println(basitFaizHesapla(100000, 1.2f, 2));
    }
    private static float basitFaizHesapla(int i, float v, int a) {
        return i*v*a/100;
    }
}
