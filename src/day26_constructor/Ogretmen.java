package day26_constructor;

public class Ogretmen {

    // Bu class'imiz kalip hanedir bize lazim olan butun kaliplari burada
    // olusturuyoruz.

    String isim="Isim belirtilmedi";
    String soyisim= "Soyisim belirtilmedi";
    String dogumTarihi="Tarih girilmedi";
    String brans="Brans belirtilmedi";
    String yanBrans="Yan brans belirtilmedi";
    public Ogretmen() { // default constructor yerine parametresiz bir
                        // constructor olusturdum. sag tus--> Generate--> constructor
                        // --> hicbirini secmeden Select None seciyoruz
    }
    public Ogretmen(String isim, String soyisim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;

        /*
        Butun degerleri iceren bir constructor olusturmak icin;
        Sag tus--> Generate--> constructor
       --> hepsini seciyoruz ve ok basiyoruz.

         */
    }
    public Ogretmen(String isim, String soyisim, String dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
    }
    /*
    ogretmen ozelliklerini yazdirmak icin toString() methodunu kullaniyoruz
    herseferinde ugrasmamak icin

     */
    @Override
    public String toString() {
        return
                "\nisim : " + isim +
                        "\nsoyisim : " + soyisim +
                        "\ndogumTarihi : " + dogumTarihi +
                        "\nbrans : " + brans +
                        "\nyanBrans : " + yanBrans ;
    }
}
