package repeat.day36_InheritanceDataTypeKullanimi;

public class CMemur extends BMuhasebe{


   protected int saatUcreti =12;
 protected    int gunlukMesai=9;

    protected  void maas() {
        System.out.println("memurlar: "+(30* saatUcreti * gunlukMesai) + " maas alir");

    }
    protected  void ozelSigorta() {

        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {

        CMemur mmr1 = new CMemur();
        System.out.println(mmr1.gunlukMesai);// 9
        System.out.println("mmr1.saatUcreti = " + mmr1.saatUcreti); //12

        mmr1.maas(); // 3240 maas alir
        mmr1.ozelSigorta();  //Memurlar %60 indirimli ozel sigorta yaptirabilir
        mmr1.sigorta(); // Tum personelimiz sigorta  yapilir
        System.out.println("mmr1.isim = " + mmr1.isim); //mmr1.isim = Isim belirtilmedi
        System.out.println("mmr1.soyisim = " + mmr1.soyisim); //mmr1.soyisim = Soyisim belirtilmedi
        System.out.println("mmr1.departmant = " + mmr1.departmant); //mmr1.departmant = dapartman belirtilmedi

        BMuhasebe mhsb1=new BMuhasebe();

        System.out.println(mhsb1.gunlukMesai);// 8   Muhasebeden
        System.out.println("mhsb1.saatUcreti = " + mhsb1.saatUcreti); //10  Muhasebeden

        mhsb1.maas(); //  personel minimum : 2400 maas alir
        mhsb1.ozelSigorta();  // Muhasebeden isteyen calisanlara %50 indirimli ozel sigorta yapilir
        mhsb1.sigorta(); // Tum personelimiz sigorta  yapilir
        System.out.println("mhsb1.isim = " + mhsb1.isim); //mhsb1.isim = Isim belirtilmedi
        System.out.println("mhsb1.soyisim = " + mhsb1.soyisim); //mhsb1.soyisim = Soyisim belirtilmedi
        System.out.println("mhsb1.departmant = " + mhsb1.departmant); //mhsb1.departmant = dapartman belirtilmedi




    }
}
