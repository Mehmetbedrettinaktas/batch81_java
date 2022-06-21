package day04_DataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi1=-132;  // java calistirilmadan deger anlamaz. 132==>-124

        byte sayi2= (byte) sayi1;

        System.out.println(sayi2);

        /*
        Genis data turundeki degeri, dar data turundeki variable'a atamak isterseniz
         Java sizin genis data turundeki degerin, dar data turunun
         sinirlarina uyup uymayacagini calistirana kadar bilemez
         ama Java Risk almaz
         Riski sifira indirmek icin burada bir sorun olursa
         sorumlulugu kabul etmenizi bekler
         bunun icin degerin onune parantez icerisinde istedigimiz data turunu
         yazmamiz yeterlidir.

         Bu riski uslendigimizde  uc durum olusabilir;
         1. bizim degerimiz , dar kalip degerlerine uygun olursa hic bir kayip olmadan olur.
         2.double bir sayiyi int'a cast edwersek bir data kayibi yasanabilir.
         3. genis kaliptan degeri dar kaliba koydugunuzda, sinirlari asan durumda veri baskalasabilir.

         */

    }
}
