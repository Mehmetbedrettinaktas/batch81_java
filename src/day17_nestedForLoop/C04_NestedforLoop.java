package day17_nestedForLoop;

public class C04_NestedforLoop {
    public static void main(String[] args) {
        /*
        verilen inputa gore *'lardan olusan bir ucgen olusturun.
        ornek iput =4 ise

                *
                * *
                * * *
                * * * *
                * * * * *
                * * * * * *
         */

        int input=6;
        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i; j++) {  // j i'ye kadar gider or: i=2 oldujunda j ** yazdirir
                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
