package day13_methodCretion;

public class C04_MethodCreation {
    public static void main(String[] args) {

        /*
        input olarak verilen 2 integer'i toplayip sonucunu
        yazdiran bir metod olusturun

         */

        int input1 = 40;
        int input2 = 20;


        topla(input1, input2);
    }

    /*
    Method 4 adimda olusturulur
    1. adim method call
    2. adim argument eklenesi gerekiyors ekleyelim
    3. eger method'un return type void'den farkli olacaksa
    bir variable olusturup, method call'u assing edelim

     */


    public static void topla(int input1, int input2) {
        // 3. adim method deklarasyonda degistirilmesi gereken
        // bolumleri degistir (access modifier, return type  vb ...)
        //4. eger return type void disinda bir seyse
        // return keyword'u ve doncecek deger hesaplamaliyiz


        System.out.println("Girilen iki sayinin toplami : " + (input1 + input2));


    }


}
