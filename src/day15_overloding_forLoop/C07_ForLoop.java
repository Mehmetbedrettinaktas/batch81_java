package day15_overloding_forLoop;

public class C07_ForLoop {
    public static void main(String[] args) {

        C06_StringTerseCevirme.terstenYazdir2("Zekeriya");


        // 100 den 1' kadar (sinirlar dahil) 8 ile bolunebilen sayilari yazdirin

        for (int i =100; i >=1 ; i--) {
            if (i%8==0){
                System.out.println(i +" ");
                //  (i +" ") bu sekilde yazdigimzda sayilar yanyana yazmaz
            }

        }

    }
}
