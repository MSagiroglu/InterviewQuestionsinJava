package inteview_question.q06_ternary;

public class Q01 {
    public static void main(String[] args) {
        /*Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
                a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
                b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
                c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen "*/
        int a=5 ,b=4,c=1;
        String uçgen =(a==b && b==c)?("Eşkenar üçgen"):(((a==b && b!=c)|| (b==c && b!=a)|| (a==c && c!=b))? "ikizkenar üçgen" : "çeşit kenar üçgen");
        System.out.println(uçgen);
        //veya
        uçgen =(a==b && b==c)?("Eşkenar üçgen"):(((a==b )|| (b==c)|| (a==c ))? "ikizkenar üçgen" : "çeşit kenar üçgen");
        System.out.println(uçgen);
    }
}
