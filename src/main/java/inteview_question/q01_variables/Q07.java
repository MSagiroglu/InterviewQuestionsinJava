package inteview_question.q01_variables;

public class Q07 {
    public static void main(String[] args) {
        /*
        İki tamsayıyı değiştirmek için bir kod yazınız
         */
        int a=10;
        int b=5;

       /* a=a+b;//15
        b=a-b;//10
        a=a-b;//5
        System.out.println(a+" "+b);*/

        int temp;
        temp=a;//10
        a=b;//5
        b=temp;//10
        System.out.println(a+" "+b);

    }
}
