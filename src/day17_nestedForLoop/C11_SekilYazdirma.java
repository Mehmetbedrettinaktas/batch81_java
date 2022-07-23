package day17_nestedForLoop;

public class C11_SekilYazdirma {
    //  1
    //  2 3
    //  4 5 6
    //  7 8 9 10
    //  11 12 13 14 15
    //  16 17 18 19 20 21
    //  22 23 24 25 26 27 28
    //  29 30 31 32 33 34 35 36    şeklini konsola yazdiriniz.
    public static void main(String[] args) {

        int satir =8;
        int value=1;

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(value + "   ");
                value ++;
            }


          //     if (value<10) {
          //         System.out.print(value + "   ");
          //     }else System.out.print(value +"  ");

          // }
            System.out.println("");
        }
    }
}
