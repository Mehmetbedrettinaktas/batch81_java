package day16_ForLoop;

public class C06_NestedFofLoop {
    public static void main(String[] args) {

        /*
        Bazen tek degisken sorunu cozmeye yetmez
        *
        * *
        * * *
        * * * *
        * * * * *

         */
        // yan yana 3 tane * yaz


        for (int i = 1; i <=3 ; i++) {

            System.out.print("* ");
        }

        //  yan yana 4 tane * yazdir
        System.out.println(" ");
        for (int i = 1; i <=4 ; i++) {
            System.out.print("* ");

        }

         /*
        Bize Ne Lazim;
         Boyle islemlerde(iki degiskenli) yani satir ve sutun gibi
        islem istenen durumlarda sadec bir FOR LOOP ile cozemeyiz,
        bunun icin Nested FOR LOOP(yani ic ice FOR LOOP) kullaniriz.
         */

        System.out.println(" ");
        // bu tur durumlarda ic ice(Nested)loop kullanmak gerekir

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");
            }

            System.out.println(" ");
        }

    }
}
