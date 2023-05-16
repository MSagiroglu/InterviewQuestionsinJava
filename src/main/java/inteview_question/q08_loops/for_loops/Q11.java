package inteview_question.q08_loops.for_loops;

public class Q11 {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //A A A A A
        //A A A A A
        //A A A A A
        shapeA(5,3);
//        Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
//        A
//        A A
//        A A A
//        A A A A
        shapeArectangle(5);
    }
    public static void shapeA(int column,int row){
        String ch="A";
        for (int i=1;i<column+1;i++){
            for (int j=1;j<row+1;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void shapeArectangle(int column){
        String ch="A";
        for (int i=0;i<=column;i++){
            for (int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
