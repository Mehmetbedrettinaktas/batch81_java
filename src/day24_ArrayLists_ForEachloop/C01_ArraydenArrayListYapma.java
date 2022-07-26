package day24_ArrayLists_ForEachloop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapma {
    public static void main(String[] args) {


        String[] arr = {"Ismail", "Nurullah", "Fatih"};
        /*
        Uzun listeler olusturmamiz gerektiginde,
        tek tek eklemek yerine array olusturup, bunlari list'e cevirmek
        daha pratik olabilir
        1- loop ile array'deki tum elementleri list'e atabiliriz
        2- Arrays.asList() kullanabiliriz

          - Ancak bu method'un 2 tane kotu yan etkisi var
           - Arrays class'i kullanildigi icin array ozellikleri gecerli olur
             dolayisiyla list'te olan add, remove gibi size'i degistiren method'lar
             bu sekilde olusturulan list'lerde kullanilamaz
           - kaynak olan array ile urun olan list ozdeslestirilir
             birinde yapilan degisiklik, otomatik olarak digerine de islenir
         */

        List<String> siniflist = Arrays.asList(arr);
        System.out.println("siniflist = " + siniflist);// [Ismail, Nurullah, Fatih]

        // List<Integer> sayilar = Arrays.asList(new  Integer[5]); //Integer data turunden 5 elemanli bir liste olusturmus olduk
        //  List <Integer> sayilar = Arrays.asList(new Integer[]{1,3,6,4,9});  //Integer data turunden 5 elemanli bir liste olusturmus olduk

        // 1. yan etkisi
        //siniflist.add("Erdi");
        //  System.out.println("siniflist = " + siniflist); // .UnsupportedOperationExceptio // desteklenmeyen operation

        //siniflist.remove(1);  // UnsupportedOperationException
        //System.out.println("siniflist = " + siniflist); // .UnsupportedOperationExceptio
        /*
        eger Array den bir list yapiyorsak ekleme, cikarma veya degistirme yapamiyoruz
         */

        //2. yan etki
        arr[1] = "Emre";
        System.out.println("degisim sonrasi array : " + Arrays.toString(arr)); // [Ismail, Emre, Fatih]
        System.out.println("Array' degistirince list: " + siniflist); // [Ismail, Emre, Fatih] array i degistirdik list de degisti
        /*
        burada Array degistirdigimizde list'de degisiyor, List degistirdigimizde Array'de degismis oluyor.
        yazdirmasi daha kolay oluyor.
         */
        siniflist.set(0, "Utku");
        System.out.println("List'i degistirince list : " + siniflist); //  [Utku, Emre, Fatih]
        System.out.println("List'i degistirince array : " + Arrays.toString(arr)); // [Utku, Emre, Fatih]

    }
}
