package day27_staticKeyword;

public class C01 {
    static  int sayi= 10;
    int rakam =5;

    public static void main(String[] args) {
        /*
        class level'da iki tur variable olusturabiliriz
        static (class) variable
        instance (obje) variable

        static veriable'lar tum class'tan kullanilabilirken
        instance olanlar static olmayan methodlar'dan kullabilir
        instance variable'lara static method'dan ulasmak istersek
        obje olusturmamiz geekir

        instance variable'lar obje veriable'i oldugu
        icin herhangi bir satirda instance variable'in
        degerinin ne oldugunu bulmak icin OBJE SATIRINDAN ITIBARENkod incelenmelidir.
        Instance obje ile ilgilidir
        Instance variable'lar obje ile baslar obje ile olurler.'

        static variable'lar class variable'i oldugu icin herhangi bir
        satirda static variable'in degerini bulmak icin CLASSIN BASINDAN
        itibaren kod incelenir.
        static class ile ilgilidir
        static variable'lar classla baslar ve classla olur
         */


        C01 obj1=new C01();// burada bir C01 de obj1 objesini olusturduk.
        System.out.println("obje1'in rakam degeri : "+obj1.rakam); // 5
        System.out.println("obje1'in sayi degeri : "+ sayi); // 10

        obj1.rakam +=1; // instance oldugu icin obje ile deger atamamiz gerekiyor
        sayi +=1;       // obj1.sayi da diyebiliriz

        System.out.println("1 artirdiktan sonra obje1'in rakam degeri : "+obj1.rakam); // 6
        System.out.println("1 artirdiktan sonra obje1'in sayi degeri : "+ sayi); // 11




        C01 obj2=new C01();
        System.out.println("obje2'in rakam degeri : "+obj2.rakam); // 5
        System.out.println("obje2'in sayi degeri : "+ sayi); // 11
        // obj2 olusturulduktan sonra deger atamadigi   icin degeri ilk deger alir.
        // class taki ilk degerini alir instance variavler icin
        // sayi ise class variable oldugu icin deger atamasi yapildiginda, deger kalici olarak degisir



        obj2.rakam ++; // 5+1 =6 // instance variable'lar ise evdeki lambalar gibidir herkesinki degisiklik gosterir.'
        obj2.sayi ++; // 11+1=12 // statice variable'lar gokteki ay gibidir herkes icin aynidir degismez.

        System.out.println("1 artirdiktan sonra obj2'in rakam degeri : "+obj2.rakam); // 6
        System.out.println("1 artirdiktan sonra obj2'in sayi degeri : "+ sayi); // 12





    }
}
