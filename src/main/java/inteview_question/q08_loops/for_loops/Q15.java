package inteview_question.q08_loops.for_loops;

public class Q15 {
    public static void main(String[] args) {
        //Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
       /* A A A A A A A A
          A X X X X X X A
          A X X X X X X A
          A A A A A A A A */

        int rows = 4, columns = 8;
        for(int i=1; i<=rows; i++){
            String s = "";
            if(i==1 || i==rows){
                for(Integer k=1; k<=columns; k++){
                    s = s + "A ";
                }
                System.out.println(s);
            }else{
                s = s + "A ";
                for(Integer m=2; m<columns; m++){
                    s = s + "X ";
                }
                s = s + "A ";
                System.out.println(s);
            }
        }
        System.out.println("*******************");
        //metodla çözüm;
        goruntuBul(10,20);

    }
    public static void goruntuBul(int rows,int columns){
        for(int i=1; i<=rows; i++){
            String s = "";
            if(i==1 || i==rows){
                for(Integer k=1; k<=columns; k++){
                    s = s + "A ";
                }
                System.out.println(s);
            }else{
                s = s + "A ";
                for(Integer m=2; m<columns; m++){
                    s = s + "X ";
                }
                s = s + "A ";
                System.out.println(s);
            }
        }
    }
}
