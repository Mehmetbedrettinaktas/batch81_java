package day46_maps;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        Map<Integer,String> sinifList=new HashMap<>();

        sinifList.put(101,"Ali, Can, JDev"); // , den sonra bosluk birakmasak sonra kullandigimizda hata aliriz
        sinifList.put(102, "Enes, Cem, Tester");
        sinifList.put(103, "Taha, Emre, JDev");
        sinifList.put(104, "Derya, Deniz, Tester");
        System.out.println("sinifList = " + sinifList);
        // sinifList = {101=Ali, Can, JDev, 102=Enes, Cem, Tester, 103=Taha, Emre, JDev, 104=Derya, Deniz, Tester}

        System.out.println(sinifList.keySet()); // [101, 102, 103, 104]
        // keySet() methodu ile key lere ulasabiliyoruz
        System.out.println(sinifList.values()); // [Ali, Can, JDev, Enes, Cem, Tester, Taha, Emre, JDev, Derya, Deniz, Tester]
        // values() methodu ile value lari Collections olan String data tipini bize donduruyor
        System.out.println(sinifList.values().size()); // 4 elementimiz var

        // Tum ogrencilerin isim ve soyisilerini sira no ile alt alta yazdiriniz
        Collection<String> tumValuCol= sinifList.values();
        String [] eachArr;
        int sira=1;
        for (String each:tumValuCol) {
           // System.out.println(each); //burada ki each bize her bir ogrenciye ait
            //ayni yapidaki isim, soyisim, brans ---> bilgilerini iceren String'ler getiriyor
            /*
            Ali, Can, JDev
            Enes, Cem, Tester
            Taha, Emre, JDev
            Derya, Deniz, Tester
             */
            eachArr=each.split(", ");
            System.out.println(Arrays.toString(eachArr));
            System.out.println(sira+"- "+eachArr[0]+" "+eachArr[1]);
            sira++;
            /*
                 [Ali, Can, JDev]
                1- Ali Can
                [Enes, Cem, Tester] split ile array 'e attik
                2- Enes Cem
                [Taha, Emre, JDev]
                3- Taha Emre
                [Derya, Deniz, Tester]
                4- Derya Deniz

             */

        }
        //Map'de bulunan ogrencilerin, isim ve soyisimlerini birlestirerek
        // bir sinif listesi olusturun

        List <String> sinifIsimSoyisimlist=new ArrayList<>();

        for (String each:tumValuCol) {
            eachArr=each.split(", ");
            sinifIsimSoyisimlist.add(eachArr[0]+ " "+eachArr[1]);
        }
        System.out.println("sinifIsimSoyisimlist = " + sinifIsimSoyisimlist);
        // sinifIsimSoyisimlist = [Ali Can, Enes Cem, Taha Emre, Derya Deniz]
    }
}
