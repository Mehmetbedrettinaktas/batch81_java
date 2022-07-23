package myPraktice.day5;

public class C04_NestedForLoopUcgen {
    public static void main(String[] args) {
         /*
        verilen inputa gore *'lardan olusan bir ucgen olusturun.
        ornek iput =4 ise

                *
                * *
                * * *
                * * * *
         */
        int input=8;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }

    }
}
