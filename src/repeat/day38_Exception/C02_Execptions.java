package repeat.day38_Exception;

public class C02_Execptions {
    public static void main(String[] args) {

        int a = 100;
        int b = 50;

        int sayac = 1;
        /*
        try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz
                  islemleri yazmak icin kullanilir
        catch'den sonraki parantez karsilasmayi bekledigimiz exception
                  turunu Javaya soylemek icin kullanilir
        catch blogu  : Java'ya soyledigimiz exception(isnisnai durum) gerceklesirse
                   Java'nin yapmasini istedigimiz islem

                   catch blogununonundeki parentez karsilasmayi bekledigimiz
              excetion'i yazabilir veya her turlu exception'da devreye girmesini istiyorsak
              tum exception'larin parenti'i olan Exception yazabiliriz.

         */

        while (sayac < 100) {

            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("payda 0 oldu, dikkatli ol");

            }

            b--;
            sayac ++;

        }


    }
}
