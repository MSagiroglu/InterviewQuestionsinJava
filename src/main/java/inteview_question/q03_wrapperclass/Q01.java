package inteview_question.q03_wrapperclass;

public class Q01 {
    public static void main(String[] args) {
        // Byte data tipinin minimum değeri ile short data tipinin
        // maksimum değerinin toplamını
        //bulmak için bir kod yazınız.

        System.out.println(Byte.MIN_VALUE + Short.MAX_VALUE);
        //Data tipi String olan “103” değerini byte data tipine
        // dönüştürmek için bir kod yazınız ve
        //yine data tipi String olan “2351” değerini short data
        // tipine dönüştürüp konsolda iki
        //değişken arasındaki farkı yazdırınız.

        String s="103";
        byte i=Byte.valueOf(s);
        String t="2351";
        short h=Short.valueOf(t);
        System.out.println(h - i);
        System.out.println(Byte.valueOf(s)-Short.valueOf(t));
    }
}
