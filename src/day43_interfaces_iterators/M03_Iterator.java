package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("liste = " + liste); // liste = [10, 20, 30]

        // Listedeki tum elementleri INDEX KULLANMADAN 3 artirin
        for (Integer each:liste) {
            each+=3;
            System.out.print(each+" "); // 13 23 33

        }
        System.out.println(" ");
        System.out.println("liste = " + liste); // atama yok ata ic loop ta yapilsada deger degismiyor = [10, 20, 30]

        /*
        Java index yapisi olmaayan collection lardaki elementlere ulasmak veya degistirmek icin
        Iterator interface'ini olusturmustur.

        Iterator interface oldugundan ondan obje uretmemiz mumkun degildir
        bunun yerine bize iterator donduren list.iterator() method'unu kullaniyoruz.

        Iterator toplam uc metodu var:
        1- next() methodu yana kaydir
        2- remove() methodu kaldir ve bize sonuc dondurur
        3- hasNext() methodu yanda bir sey var mi? sonuc boolean
         */

        System.out.println("liste = " + liste); // liste = [10, 20, 30]
            // [10, 20, 30] Iterator uzerine atladigi sayiyi bize yazdiriyor.
        Iterator itr1= liste.iterator(); // iterator --> yenileyici

        System.out.println("itr1.next() = " + itr1.next());// itr1.next() = 10
        System.out.println("itr1.next() = " + itr1.next()); // 20
        System.out.println("itr1.next() = " + itr1.next()); // 30
        //System.out.println("itr1.next() = " + itr1.next()); // 30 'dan sonra element kalmadigindan next() RTE verir
        // iterator 'da geri donus yok adim adim sona ulastiktan sonra
        // basa gelmek isterseniz yeniden bir iterator olusturmamiz gerekir.

        //  [10, 20, 30]
      Iterator itr2= liste.iterator();
      // yeni iterator 'i itr2 kullanarak listenin tum elementlerini silelim
        itr2.next();
        itr2.remove();
        System.out.println("liste = " + liste); // liste = [20, 30]

         itr2.next();
        itr2.remove();
        System.out.println("liste = " + liste); //liste = [30]

        itr2.next();
        itr2.remove();
        System.out.println("liste = " + liste); //liste = []
        // iterator ile elementleri gezip, remove yapinca
        // liste kalici olarak degiti

        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeniden liste : "+liste); // yeniden liste : [10, 20, 30]
        Iterator itr3= liste.iterator();
        while (itr3.hasNext()){
            itr3.next();
            itr3.remove();
        }
        System.out.println("Loop'dan sonra liste : "+liste); // Loop'dan sonra liste : []

        /*
        Goruldugu gibi Iterator kullanarak yapabildigim:
        1- tum collection elementlerini yazdirmak
        2- tum collection elementlerini silmek
        bu da bize yetmez
         */



    }
}
