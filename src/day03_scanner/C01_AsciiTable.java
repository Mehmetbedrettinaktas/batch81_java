package day03_scanner;

public class C01_AsciiTable {
    public static void main(String[] args) {
        int sayi=10;
        char harf='a';
        System.out.println(sayi+harf); // 107
        String str="banan";
        System.out.println(sayi*harf); // 970
        System.out.println(str+harf); // banana
        System.out.println(str+sayi+harf); // banan10
        /*  cahr  data turu isleme girdigi degiskenin turune gore farkli
        davranir. sayi + harf  variable 'i int oldugunundan harf variable'i int oldugundan
        harf variable'i asci tablosunadan 97 degerini kullanir.


         char yeniHarf = harf+2; java once sagdaki islemi yapar, sagda int + cahr gorunce ascii degerini
          sonra atama islemini yapmaya calisir
          cahr yeniHarf=99;
          bu atama java acisindan kabul edilir bir durum degildir.
          2- str+ harf ; ==> banana String variable cok gucludur, hangi data turu ile isleme
          girerse girsin diger data turunu kendine benzetir.

          String=Strong
         */
        // peki .. konsola 10a gormek istersek nasil yazdirmaliyiz?
        System.out.println(""+sayi+harf);// 10a  "" bu ifadeyi islemin nersine yazarsak yazalim islemi
                                        // String ifadeye cevirir.
        System.out.println(sayi+""+harf); // 10a

        char deger ='1';
        System.out.println(deger+harf); // 146  '1' + 'a' ==> 49+97=146



    }
}
