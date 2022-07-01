package day10_StringManipulation;

public class C06_IndexOf {
    public static void main(String[] args) {
        String str ="Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("t"));  // -1
        // bana integer dondurur int'de yok diye bir deger bulunmuyor
        // 0' desek J'nin index'idir -1 deger  donerse biz aranan string'in str'da olmadigini anlamis oluyoruz
        // Java -1 dondurmayi tercih etmistir.
        System.out.println(str.indexOf("o")); // 5
        String str5="djköasddfäöfieiaÄÜVASDOFDVPAAVovvkffofov";
        // str5' p harfi var midir?
        if (str5.indexOf("=")==-1){
            System.out.println("str5 de istenen karekter kullanilmimis");

        }else {
            System.out.println("str5'de istenen karekter kullanilmis");
        }
    }
}
