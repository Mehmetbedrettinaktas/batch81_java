package day23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_list {
    public static void main(String[] args) {
         /*
         elimizdeki urunlerin bulundugu bir liste var
         urun listedeki istenen siradaki urunu
         istedigimiz yeni urunle degistirip
         eski urunu, varolan eski urunler listesine ekleyelim

          */

        List <String> urunler = new ArrayList<>();
         urunler.add("Nutella");
         urunler.add("Ikram");
         urunler.add("Cekirdek");
         urunler.add("Cay");

         List <String> eskiUrunler=new ArrayList<>();
         // listedeki ikram'in yerine biskrem koyalim,
        // ikram'i da urunler listesine ekleyelim

        String yeniUrun="Biskrem";
        String silinecekUrun="Ikram";

        int temp=urunler.indexOf(silinecekUrun);
       String silinenUrun= urunler.set(temp,yeniUrun);

       eskiUrunler.add(silinenUrun);

        System.out.println("Urunler listesi : "+urunler); // [Nutella, Biskrem, Cekirdek, Cay]
        System.out.println("Eski urunler listesi : "+eskiUrunler);  // [Ikram]




         yeniUrun="kahve";
         silinecekUrun="Cay";

        temp=urunler.indexOf(silinecekUrun);
        silinenUrun= urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);

        System.out.println("Urunler listesi : "+urunler); //[Nutella, Biskrem, Cekirdek, kahve]
        System.out.println("Eski urunler listesi : "+eskiUrunler);  //  [Ikram, Cay]


    }
}
