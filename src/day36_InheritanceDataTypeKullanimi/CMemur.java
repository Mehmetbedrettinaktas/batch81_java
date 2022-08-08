package day36_InheritanceDataTypeKullanimi;

public class CMemur extends BMuhasebe {

    protected int saatUcreti = 12;
    protected int gunlukMesai = 9;

    protected void maas() {
        System.out.println("Memurlar  : " + (30 * saatUcreti * gunlukMesai) + " maas alir");
    }

    protected void ozelSigorta() {
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        CMemur mmr1= new CMemur();

        System.out.println(mmr1.gunlukMesai);// 9 once kendi class'ina bakar'
        System.out.println("mmr1.saatUcreti = " + mmr1.saatUcreti); // 12
        mmr1.maas(); //3240
        mmr1.ozelSigorta(); // Memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta();     //mmr1.isim = Isim belirtilmedi
        System.out.println("mmr1.isim = " + mmr1.isim); // Isim belirtilmedi
        System.out.println("mmr1.soyisim = " + mmr1.soyisim); // Soyisim belirtilmedi
        System.out.println("mmr1.departman = " + mmr1.departman); // Departman belirtilmedi

        BMuhasebe mhsb1= new BMuhasebe();

        /*
      Her ne kadar Memur class'inin icinde olsam da olusturdugumuz
      obje muhasebe class'indan cunku Muhasebe data turu ve
      constructor BMuhasebe
       - Aslinda her bir class ayni zamanda bir data type tir.

       String str= "Murat';
       ArrayList<Integer> list= new ArrayList<>();
       Integer sayi =20;

       BMuhasebe class'i da obje olusturabilen bir class'dir
       yani data turudur

       Obje olusturdugumuz her class ta ayni zaman da bir data turudur.

       Data turu ve constructor ayni ise direk o class 'a gidiyoruz, varsa
       vardir, yoksa parent'ine gider. Childe gidilmez
       */

        System.out.println(mhsb1.gunlukMesai);// 8   Muhasebeden
        System.out.println("mhsb1.saatUcreti = " + mhsb1.saatUcreti); // 10  Muhasebeden
        mhsb1.maas(); // Muhasebeden  2400 maas alir.
        mhsb1.ozelSigorta(); //  Muhasebeden
        mhsb1.sigorta();     // APersonel --> isteyen calisanlara %50 indirimli ozel sigorta yapilir
        System.out.println("mhsb1.isim = " + mhsb1.isim); // APersonel  --> Isim belirtilmedi
        System.out.println("mhsb1.soyisim = " + mhsb1.soyisim); //APersonel  --> Soyisim belirtilmedi
        System.out.println("mhsb1.departman = " + mhsb1.departman); // APersonel  --> Departman belirtilmedi



    }

}
