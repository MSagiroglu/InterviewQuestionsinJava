package inteview_question.q01_variables;

public class Q01 {
    public static void main(String[]args){
        /*Herhangi bir 3 öğenin fiyatları için double data
        tipinde değişkenler oluşturunuz. Fiyatların toplamını
        konsola yazdırınız
        */
        double a=1.0 ,b=2.0 , c=3.0;
        double gomlek1=10.0;
        double gomlek2=10.0;
        double gomlek3=10.0;
        System.out.println(gomlek1+gomlek2+gomlek3);
        System.out.println(total(gomlek1, gomlek2, gomlek3));
    }//main
    public static double total(double a,double b,double c){
        return a+b+c;
    }
}//class

