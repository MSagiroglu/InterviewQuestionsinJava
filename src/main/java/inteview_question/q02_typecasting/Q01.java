package inteview_question.q02_typecasting;

public class Q01 {
    public static void main(String[] args) {
        //long data tipinde bir değişken oluşturunuz ve onu bir int değişkenine dönüştürünüz.
        long l=111;
        int i= (int) l;
        System.out.println(i);

        // Double data tipinde bir değişken oluşturunuz ve onu bir short değişkenine dönüştürünüz.
        //Sonrasında bu short değişkenin değerini konsolda yazdırınız.
        //Not : Çıktıya dikkat ediniz, ondalık bir değer olmayacaktır.
        double d=10.523;
        short s=(short) d;
        System.out.println(s);

    }

}
