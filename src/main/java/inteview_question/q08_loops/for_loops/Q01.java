package inteview_question.q08_loops.for_loops;

public class Q01 {
    public static void main(String[] args) {
        // soru 1:ekrana 10 kez "Java guzeldir" yazdiran kodu yaziniz
        for(int i=1;  i<11; i++){
            System.out.println(i+" : Java Güzeldir");
        }
        System.out.println("*********************************************");
        //while ile çözüm
        int i=1;
        while (i<11){
            System.out.println(i+" : Java Güzeldir");
            i++;
        }
        System.out.println("*********************************************");
        //do-while ile çözüm
        int j=1;
        do {
            System.out.println(j+" : Java Güzeldir");
            j++;
        }while (j<11);
    }
}
