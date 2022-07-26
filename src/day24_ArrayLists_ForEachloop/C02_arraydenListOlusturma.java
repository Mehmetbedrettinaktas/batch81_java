package day24_ArrayLists_ForEachloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_arraydenListOlusturma {
    public static void main(String[] args) {
        /*
        icinde 200 tane 1000'den kucuk
        pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip listede var
        olup olmadigini kullaniciya yazalim

         */
        // Random class'i aynen Scanner gibi calisiyor

        Random rnd = new Random(); // 0 ile 1 arasinda sayi uretir
        int sayi = 0;
        List<Integer> sayiListesi = new ArrayList<>();

        while (sayiListesi.size() < 200) { // 200'e ulasincaya kadar sayi uretir

            // listemizin yunik olmasini istiyorsak kontrol edecegiz
            // sayi=rnd.nextInt()// 0ile 1 arasinda sayi uretir

            /*
            Random sınıfının nextInt() yöntemi, 0 ile ArrayList boyutu arasında
            rastgele bir değer oluşturmak için kullanılabilir.

            nextInt() yönteminden oluşturulan sayıyı kullanarak
            ArrayList'ten rastgele bir öğe döndürmek için get()
            yöntemini kullanın.

             */
            sayi = rnd.nextInt(1000); // girdigimiz sinira(1000) gore, 1000 den kucuk  tamsayi uretir.
            // bound ==>sinir--> rnd.nextInt(bound ... ) girdigimiz sinira kadar bize rast gele sayi uretir.

            if (!sayiListesi.contains(sayi)) { //  eger listede yoksa(!) listeye ekleyecek
                sayiListesi.add(sayi);
            }
        }
        System.out.print("sayiListesi = " + sayiListesi);

        boolean bildiMi = false;
        int tahminSayisi = 1;
        Scanner scan = new Scanner(System.in);

        while (!bildiMi) { // bildiMi==false ---> boylede yazilabilir ancak prof degil

            System.out.print("Lutfen bir sayi tahmininde bulunun : ");
            sayi = scan.nextInt();

            if (sayiListesi.contains(sayi)) {
                System.out.println("Tebrikler " + tahminSayisi + " adet tahminde listeden bir sayi buldunuz");
                bildiMi = true;
            } else {
                System.out.println(tahminSayisi + " adet sayi soylediniz ama hic biri listede yok");
                tahminSayisi++;
            }


        }

    }
}
