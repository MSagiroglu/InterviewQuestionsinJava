package inteview_question.q09_array;

public class Q02 {
    public static void main(String[] args) {

        //asagidaki multidimensional arrayin ic arraylerindeki son elemanlarinin
        // carpimini ekranayazdian kodu yaziniz {{1,2,3}, {4,5}, {6}}

        int arr [][]={{1,2,3}, {4,5}, {6}};


        int result =1;
        for (int i [] : arr){
            for (int z : i){
                if (z==i[i.length-1]){
                    result*=z;
                }
            }
        }
        System.out.println(result);
    }
}
