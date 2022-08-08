package day36_InheritanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe {
    protected int saatUcreti = 9;
    protected int gunlukMesai = 8;

    protected void maas() {
        System.out.println("Yanhizmetliler  : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void issizlikSigorta() {
        System.out.println("Yan hizmetlilerr %30 indirimli issizlik sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        /*

        overriding child class'daki bir method'un parent
        class'daki ayni isimdeki methodu etkisiz hale getirerek kendisinin
        spesifik ozelligini ortaya cikarmasidir.


        overriding'i nerede dikkate aliyoruz?
        -Bir obje olustururken data turu ve constructor farkli ise.

        Eger bir obje olustururken data turu ve constructor farkli ise
        objenin ozellikleri belirleken
        3 konuya dikkat cekmeliyiz;
        1- Obje her zaman constructor'in oldugu class'da olusur
        2- objenin ozelliklerini aramaya data turunun
        oldugu class'dan baslariz, bu class'da ararnan ozellik
        bulunamazsa parent class'lara bakilir orada bulamazsak CTE verir.

        3- Eger aranan ozellik variable ise buludugumuz ilk degeri yazdiririz
        ararnan ozellik method ise degeri yazdirmadan once
        degeri override edilmis mi diye kontrol etmemiz gerekir.
        eger override edildiyse en guncel degeri yazdiririz


         */

        BMuhasebe yh1= new EYanHizmetliler(); // aramaya muhasebe class'idan baslar

        System.out.println(yh1.gunlukMesai);//  Muhasebeden 8
        System.out.println("yh1.saatUcreti = " + yh1.saatUcreti); // Muhasebeden 10
        yh1.maas(); // 2160 Yanhizmetliler    // maas buldugu icin CTE vermez ancak hemen yazmaz override edilmis mi diye bakar
        yh1.ozelSigorta(); // Muhasebeden       override edildigi icin kendi class'dan alir
        yh1.sigorta();     // APersonel
        System.out.println("yh1.isim = " + yh1.isim); // APersonel
        System.out.println("yh1.soyisim = " + yh1.soyisim); // APersonel
        System.out.println("yh1.departman = " + yh1.departman); // APersonel

      //  System.out.println(yh1.issizlikSigorta); //CTE
        //Aramaya muhasebeden basladigimizdan issizlikSigortasi
        //bulamadigimizdan CTE verdi.
    }
}
