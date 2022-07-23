package day25_Constructor;

public class Car {
    /*
    Bu class bizim kaliphanemiz bir araba
    olusturmak icin ihtiyacimiz
    olan variable ve method'lari bu class'da belirleriz

    sonra farkli class'larda araba olusturmamiz gerekirse
    bu class'dan bir obje olustururp burada  belirlenen variable
    ve method'lara gore araba uretirir
     */

    public String marka = "Marka belirtilmedi"; //  bunlara Baska class'larda veya heryerden
                                                // ulasilmasini istiyorsak bunlarida public yapmak lazim
    public String model = "Model belirtilmedi";
    public int yil;
    public int fiyat;

    public void benzinliArac() {
        System.out.println("Bu arac benzinli motora ahiptir");
    }

    public void maxHiz(int hiz) {

        System.out.println("Bu araba max " + hiz + " km hiz yapar");
    }

}
