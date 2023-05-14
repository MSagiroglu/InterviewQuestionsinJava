package inteview_question.q07_switchcase;

public class Q03 {
    /*
    B!r Enum olusturun ve !ç!ne CHROME, SAFARI, IE, FIREFOX, YANDEX g!b! tarayıcı adlarını
koyunuz. Sw!tch !fades!n! kullanın ve CHROME !ç!n 'CHROME kullanıyorum', SAFARI !ç!n
'SAFARI kullanıyorum', 'IE !ç!n IE kullanıyorum', 'FIREFOX !ç!n FIREFOX kullanıyorum' ve
YANDEX !ç!n 'YANDEX kullanıyorum', CHROME, SAFARI, IE, FIREFOX, YANDEX'ten farklı
tarayıcılar !ç!n 'Geçers!z tarayıcı' yazınız.
Not: Gelistirici konsolunda enum olusturmalısınız.
     */
    public static void main(String[] args) {
    String browser = C03.CHROME.toString();

    switch (browser){
        case "CHROME":
            System.out.println("Chroem kullaniyorum");
            break;
        default:
            System.out.println("gecerli enumlar icinden gir \n ayri bir enum classsi olusturmayi da unutma");
    }
}
}
