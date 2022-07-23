package day26_constructor;

public class Araba {

    public String marka = "Marka belirtilmedi";
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public Araba(String markaR, String modelR, int yilR, int fiyatR) { // Java nin olusturdugu constructor dir
        marka = markaR; // burada objeye daha once atanan default degerler yerine istedigimiz
        model = modelR; // degerleri atadik
        yil = yilR;
        fiyat = fiyatR;
    }
        /*
        sag tus klick Generate(olustur)tikliyoruu
        ex: Costructor, toString() override Methods...
         */
    public Araba() {
    }

    /*
    biz herhangi bir constructor olusturdugumuzda
    Java default constructor'i siler
    eger biz projemizde bir sorun yasanmasini istemiyorsak
    mutlaka default constructor yerine
    parametresiz bir constructor olusturmaliyiz
     */
    public void benzinliArac() {
        System.out.println("Bu arac benzinli motora sahiptir");
    }

    public void maxHiz(int hiz) {
        System.out.println("Bu araba max " + hiz + " km hiz yapar");
    }
}
