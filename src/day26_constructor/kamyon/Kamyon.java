package day26_constructor.kamyon;

public class Kamyon { // POJO : planing old java object->modal class
    // 1. instance variable'lar olusturduk
    public String marka ;
    public String model = "Model belirtilmedi";
    public int yil=2015;
    public int fiyat;




    public Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka = marka;// basina this. yazmdigimizda bu instance variable demektir
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
        /*
          bizim temel amacimiz KamyonRunner'da argument olarak girilen degerin
          Kamyon class'inda intstance variable'a atanmasi
          Ancak scope konusunda ogrendigimiz gibi
          Kamyon constructor scope'unda marka oldugu icin
          instance marka'ya gitmiyor
          Bu karisikligi gidermek icin instance variable'lari
          belirli hale getirmemiz lazim
          Java bunun icin this keyword'u olusturmustur
          Genel kullanim acisindan this keyord'u kodu herkesin anlamasini
          kolaylastirdigi icin tercih edilir
         */
    }




    public Kamyon() { // parametresiz constructor

    }

    public Kamyon(String marka, String model, int fiyat) {

     this.marka=marka;
     this.model=model;
     this.fiyat=fiyat;

    }

    public Kamyon(String marka, String model) {
        this.marka= marka;
        this.model = model;
    }

    @Override
    public String toString() {
        return
                "\nmarka : " + marka +
                        "\nmodel : " + model +
                        "\nyil : " + yil +
                        "\nfiyat : " + fiyat;


    }
}
