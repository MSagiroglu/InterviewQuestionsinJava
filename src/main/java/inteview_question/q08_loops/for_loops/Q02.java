package inteview_question.q08_loops.for_loops;

public class Q02 {
    public static void main(String[] args) {
        // Soru: 10 ile 30 (10 ve 30 dahil) arasindaki sayilari
        // aralarinda virgul olacak sekilde ayni satirda  yazdiriniz
        for (int i=10; i<31;i++){
            if (i==30){
                System.out.print(i);
            }else{
                System.out.print(i+",");
            }

        }
        System.out.println();
        System.out.println("*********************************************");
        //do-while ile çözüm
        int i=10;
        do{
            if (i==30){
                System.out.print(i);
            }else{
                System.out.print(i+",");
            }
            i++;
        }while(i<31);

    }
}
