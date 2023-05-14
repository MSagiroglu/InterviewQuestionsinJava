package inteview_question.q01_variables;

public class Q02 {
    public static void main(String []args){
        /*
        Herhangi bir 3 öğe için float, long ve integer data
        tipinde değişkenler oluşturunuz. Bu
değişkenlerin değerlerinin çarpımını konsolda yazdırınız
         */
        System.out.println(multiply(12.5f, 5458l, 5));
    }

    private static float multiply(float v, long l, int i) {
        return v*l*i;
    }
}
