package repeat.day18_DoWhileLoop;

public class C03_WhileLoop {
    public static void main(String[] args) {

        /*
        While loop'ta once kontrol yapip sonra
        islem yaptigimiz icin islem bittikten sonra
        loop'un kirilmasi icin bir kez daha basa donmemiz gerekiyor
        bu durumda fazladan bir islem yapiliyor
         */

        int  sayi =7;
        while (sayi<10){
            System.out.println(sayi);
            sayi++;
        }
        /*
        do-while loop ile yapalim
         */

         sayi=7;

         do {
             System.out.println(sayi);
             sayi++;
         }while (sayi<10);
    }
}
