package myPraktice_day02;

public class C28_lastIndexOf {
    public static void main(String[] args) {
        /*
        Kullanicidan bir cumle ve bir harf isteyin,
        harfin cumlede var o, olupm olmadigini yazdirin.

         int kelimeIlkIndex=cumle.indexOf(kelime);
        int kelimeSonindex=cumle.lastIndexOf(kelime);
         */
        String str ="Java ile hayat dahada guzel olacak insallah";
        char harf='z';

        int harfilk_l= str.indexOf('l');
        System.out.println("ilk l index'i : "+harfilk_l); // 6
        int harfSon_l=str.lastIndexOf('l');
        System.out.println("son l index'i : "+harfSon_l); // 40
        String harf1= "z";
        System.out.println(str.contains("z")); // true




    }
}
