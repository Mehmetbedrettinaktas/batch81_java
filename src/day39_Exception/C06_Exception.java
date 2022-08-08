package day39_Exception;

public class C06_Exception {
    public static void main(String[] args) {
        try {

            calis();

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }

    private static void calis() {

        throw new RuntimeException("Çoook çalış");

        /*
        throw ile kontrollü exception olusturuken
        parametre olarak istedigimiz hata mesajini girebiliriz
         */
    }

}
