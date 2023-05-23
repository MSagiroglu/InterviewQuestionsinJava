package inteview_question.q09_array;

public class Q01 {
    /*
    Asagidaki multi dimensional arryin tum elemanlarinin carpimini ekrana yazdiran kodu yaziniz
    {{1,2,3}{4,5,6}
     */
    public static void main(String[] args) {
        //Asagidaki multi dimensional arryin tum elemanlarinin carpimini ekrana yazdiran kodu yaziniz

        int mArr[][] = {{1, 2}, {4, 5, 6}};

        int multiply = 1;

        for (int i[] : mArr) {
            for (int z : i) {
                multiply *= z;
            }
        }
        System.out.println(multiply);

    }

}
