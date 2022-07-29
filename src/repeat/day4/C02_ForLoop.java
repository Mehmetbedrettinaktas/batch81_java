package repeat.day4;

public class C02_ForLoop {
    public static void main(String[] args) {
        /*
        10 ile 30 arasindaki(10 ve 30 dahil) sayilari
        aralarinda virgul olarak ayni satirda yazdirin
         */

        int bas=30;
        int son=60;

        for (int i = bas; i <=son ; i++) {
            if (i<son){
                System.out.print(i +",");
            }else System.out.print(i);

        }



    }
}
