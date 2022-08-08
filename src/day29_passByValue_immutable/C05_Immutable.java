package day29_passByValue_immutable;

public class C05_Immutable {
    public static void main(String[] args) {

        String isim="Mine";
        isim=isim.toUpperCase();  // Burada kalici olarak degisir cunku atama yapilmis
        // aslinda isim yeni bir obje olmus demektir referans degismemis ancak variablemiz olusturur.

        System.out.println("isim = " + isim); // isim = MİNE

        isim="Mevlut";
        System.out.println(" isimdeki degisiklik gormek icin = " + isim); // Mevlut

        // Yeni deger atandigi icin degisiklikleri artik hafizada sadece cop olarak durur.

        for (int i = 0; i <100 ; i++) {
            isim += ".";
            // burada Java Mevlut icin 100 tane obje olusturmus oluyor.
            // bunlar cope gitmek icin beklenir.

        }
        System.out.println("isim = " + isim); // Mevlut.....................


    }
}
