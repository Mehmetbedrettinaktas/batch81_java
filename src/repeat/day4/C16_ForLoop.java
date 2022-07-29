package repeat.day4;

public class C16_ForLoop {
    public static void main(String[] args) {
        //1 'den 100'e kadar olan tamsayilari toplayin

        int toplam=0;
        for (int i = 1; i <=100; i++) {
           toplam +=i;

            
        }
        System.out.println("toplam = " + toplam);


        System.out.println();
        /*
        verilen iki sayinin ilkinden ikinciye kadar
        3'er 3'er yazdirin (ikinci syi sartlari saglamiyorsa yazdirmayalim)

         */
        int bas =20;
        int bitis=100;

        for (int i = bas; i <=bitis ; i+=3) {  // i+=3; demek islemi 3 er 3 er artir demek
            System.out.print(i +" ");


        }

        System.out.println("********"); // hiclik yazdirdigimizda bir alt satira gememizi sagliyor

        // verilen sayidan baslayarak geriye 1'e
        // dogru 3 ile bolunebilen sayilari yazdirin

        int input=100;

        for (int i =input; i >=1 ; i--) {
            if ( i%3==0){
                System.out.print(i+" ");
            }

        }




    }
}
