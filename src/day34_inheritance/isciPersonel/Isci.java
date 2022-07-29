package day34_inheritance.isciPersonel;

public class Isci extends Personel {
    /*
    Normal hayatmizda parent cocuk sahibi olmaya karar verebilir.
    Java'da ise child class'lar ozelliklerini inherit etmek istediklerini
    class'i kendilerine parent edinirler

    mesela isci class'i olusturunca nelere ihticai var
    diye dusunsek Personel class'indaki tum variable
    ve method'lara ihtiyaci oldugunu gorebiliriz.
    Bu durumda yeniden o veriable ve methodl'lari olusturmak
    yerine
    Personel class'ini kendimize parent ediniriz.

    Bir class'i parent edinmek icin extends keyword kulanmaliyiz

    bir class baska bir class'parent edindiginde
    1- parent class'daki tum ozelliklere (variable+method) otomatik olarak sahip olur
    2- parent class'daki ozelliklerden bazilarini kendine uyarlayabilir
    3- parent class'da olmayan bazi yeni ozellikler olusturabilir

    not:parent class'daki ozeliklerden hicbirini reddedemez ama degistirilebilir

     */

    int persNo=1001;
    public static void main(String[] args) {

        Isci isci1 = new Isci();
        System.out.println(isci1.isim); // isim belirtilmedi
        // kendi class'imizda isim variable yok, onun icin parent'a gider
        isci1.isim="Selim";
        System.out.println("isci1.persNo = " + isci1.persNo); // 1001
        // kendi class'imizda varsa onu kullaniriz

        isci1.maas();// Tum personelin maasi vardir:



    }
    public void  maas(){
        System.out.println("isciler minimum 15 euro saat ucreti alir");
        // isciler minimum 15 euro saat ucreti alir


    }

    public  void  ozelSigorta(){
        System.out.println("Iscilerden isteyen %100 indirimle ozel sigortadan yaptirabilir");
    }
}
