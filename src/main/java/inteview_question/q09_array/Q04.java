package inteview_question.q09_array;

public class Q04 {
    public static void main(String[] args) {
        /*
        asagidaki multi dimensional arraylerin ic arraylerinde ayni indexe sahip elemanalarini
        toplamini ekrana yazdiran bir program yaziniz
        arr1 = {{1,2},{1,2,3},{6}} ve arr2 = {{7,8,9} {10,11},{12}}
         */
        int[][] arr1 = {{1, 2}, {1, 2, 3}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};

        // İki dizinin de satır sayısını kontrol edelim
        int rowCount = Math.min(arr1.length, arr2.length);

        for (int i = 0; i < rowCount; i++) {
            // İki dizinin de aynı indeksteki iç dizilerini kontrol edelim
            int[] innerArr1 = arr1[i];
            int[] innerArr2 = arr2[i];
            int innerRowCount = Math.min(innerArr1.length, innerArr2.length);

            // İç dizilerin elemanlarını toplayalım
            int sum = 0;
            for (int j = 0; j < innerRowCount; j++) {
                sum += innerArr1[j] + innerArr2[j];
            }

            // Sonucu ekrana yazdıralım
            System.out.println( "2 ayrı Array'in "+i + " . index toplamı : "+ sum);
        }
    }
}
