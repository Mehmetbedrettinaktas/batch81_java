package day30_Immutable;

public class C02_StringHavuzu {
    public static void main(String[] args) {
        String str1="Ali Can";
        String str2=str1+"";
        String str3= new String("Ali Can"); // java new kyword gordugunde hemen yeni bir oje olusturur
        String hiclik="";
        String str4=str1.concat(hiclik);

        System.out.println(str1==str2); // false
        System.out.println(str1.equals(str2)); // true

        System.out.println(str1.equals(str3)); // true
        System.out.println(str1==str3); // false

        System.out.println(str2.equals(str4));// true
        System.out.println(str2==str4); // false

        System.out.println("s1-s4: "+str1.equals(str4));// true
        System.out.println("s1-s4: "+(str1==str4)); // true

         /*
         == lerde hem degerlerleri hemde referanslarida
         karsilastiriyor o yuzden false verir
         equals() ise sadece degerleri karsilastiriyor

         Yeni bir atama yapildiginda java hemen sol tarafa variable
         sag tarafa degeri kontrol eder. Ama  java hemen degeri kontrol ediyor
          */

        /*
        1- yeni bir String olusturulurken esitligin saginda
        new Keyword'u olursa java direk yeni bir obje ve referans no olusturur.

        2- eger esitligin saginda bir method calisiyors veya + ile islemi yapiliyorsa
        String immutable oldugundan degisikligi kaydetmek uzere hen´men bir kopya String
        ve referansNo olusturur, sobra degeri hesaplayip bu yeni kopya objenin icine koyar
         */
        String str5="Ali Can";
        String str6=str1;

        System.out.println(str1.equals(str5)); // true
        System.out.println(str5==str1); // true

        System.out.println(str1.equals(str6)); // true
        System.out.println(str1==str6); // true

        System.out.println(str5.equals(str6)); //true
        System.out.println(str5== str6); // true

        /*
        eger yeni String objesi olusturulurken new kelimesi kullanilmaz
        veya esitligin saginda  + islem olmazsa Java bakar

        Eger daha once olusturulan String objelerden(String havuzu)
        bire-bir ayni String varsa o objeyi ve referansini kullanir,

        bire-bir aynisi yoksa yeni bir obje olusturur.
         */





    }
}
