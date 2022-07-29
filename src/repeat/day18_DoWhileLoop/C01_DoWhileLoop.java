package repeat.day18_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
         Kullanicinin hata yapmadigini farz edin.
         */

        char ilkHarf='a';
        char sonharf='z';

        char temp=ilkHarf;
        String buyult="";

        while (temp<=sonharf){
            buyult=(temp+"").toUpperCase();

            System.out.print(buyult+ " ");
            temp+=1;

        }
    }
}
