package day32_StringBulder;

public class C08_equals {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        System.out.println(sb1.equals(sb2));// false

        System.out.println(sb1.equals(sb1)); // true
        // StringBuilder 'da equels method'u ancak ayni olursa true doner
        // String'deki gibi dusunmemek lazim

        System.out.println(sb1.equals(str)); // false

        System.out.println(sb1.compareTo(sb2));  //0
        // burada sb1 ile sb2 tamamen ayni ise 0 degerini dondurur

        StringBuilder sb3 = new StringBuilder("Jave");
        System.out.println(sb1.compareTo(sb3));   // -4

        /*
        compareTo iki StringBuilder'i batan baslayarak
        harf harf karsilastirir ilk harfleri ayni ise
        3.lere gecer ve ilk farkli olan harfe kadar gider
        farkli olan iki harfin ascii kodlari arasindaki farki verir

        eger hic farkli harf yoksa sonuc olarak 0 dondurur

         */
    }
}
