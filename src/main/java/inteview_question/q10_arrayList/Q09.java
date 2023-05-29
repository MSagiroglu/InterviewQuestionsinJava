package inteview_question.q10_arrayList;

public class Q09 {
    public static void main(String[] args) {
        //Example 1: Size verilen bir array'in "Mountain Array" olup olmadigini gosteren kodu yaziniz.
        //           [0, 2, 5, 3, 1, -2]

        int [] arr = {0, 2, 5, 3, 1, -2};

        // cözüm

        int max= arr[0];
        int indexOfMax =0;

        for (int i =0; i<arr.length; i++){
            max = Math.max(arr[i],max);
            if (arr[i]==max){
                indexOfMax=i;
            }
        }

        boolean mountain1= true ;
        for (int i =1; i<=indexOfMax; i++){
            if (arr[i-1]>arr[i]){
                mountain1 = false;
            }
        }
        boolean mountain2= true;
        for (int i =indexOfMax+1; i<arr.length; i++){
            if (arr[i-1]<arr[i]){
                mountain2 = false;
            }

        }
        if (arr.length<3){
            System.out.println("No it is not a mountain array");
        } else if (mountain1==true && mountain2==true){
            System.out.println("Yes it is a mountain array :)");
        }else {
            System.out.println("No it is not a mountain array");
        }
    }
}
