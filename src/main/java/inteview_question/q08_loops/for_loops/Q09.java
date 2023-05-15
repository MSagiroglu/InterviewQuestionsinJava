package inteview_question.q08_loops.for_loops;

public class Q09 {
    public static void main(String[] args) {
        //B!r Str!ng’ de tekrarlanan karakterler! yazdırmak !ç!n kod yazınız.
        //Örneg!n; accessories ´ ces

        String str = "accessories";
        String sameCh = "";


        for (int i = 0; i <= str.length() - 1; i++) {

            String s = str.substring(i, i + 1);

            if (str.indexOf(s) != str.lastIndexOf(s)) {

                if (!sameCh.contains(s)) {

                    sameCh += s;
                }
            }

        }
    }
}


