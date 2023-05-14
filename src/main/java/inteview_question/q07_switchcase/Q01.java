package inteview_question.q07_switchcase;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //Ex 1:kullanicidan gun ismini alip haftaici veya haftasonu yazdirlaim
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen gün ismi giriniz");
        String gun=input.next();
        switch (gun.toUpperCase()){
            case "PAZARTESİ":

            case "SALI":

            case "ÇARŞAMBA":

            case "PERŞEMBE":

            case "CUMA":
                System.out.println("HAFTAİÇİ");
                break;
            case "CUMARTESİ":

            case "PAZAR":
                System.out.println("HAFTA SONU");
                break;
            default:
                System.out.println("geçersiz bir girdi");
        }

        //EX 2 :Bel!rl! b!r yılın bel!rl! b!r ayındak! gün sayısını görüntülemek !ç!n b!r kod yazınız.
        //Örnek: 2000 yılının Subat ayında gün sayısı 29.

        System.out.println("YIL GİRİNİZ");
        int  yil=input.nextInt();
        System.out.println("AY NUMARASINI GİRİNİZ");
        int  ay=input.nextInt();
        if (yil%4==0){
            switch (ay){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("31 gün vardır");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 gün vardır");
                    break;
                case 2:
                    System.out.println("29 gün vardır");
                    break;
                default:
                    System.out.println("yanlış değer girdiniz");
            }
        }else {
                switch (ay){
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println("31 gün vardır");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("30 gün vardır");
                        break;
                    case 2:
                        System.out.println("28 gün vardır");
                        break;
                    default:
                        System.out.println("yanlış değer girdiniz");}
            }
        }
    }

