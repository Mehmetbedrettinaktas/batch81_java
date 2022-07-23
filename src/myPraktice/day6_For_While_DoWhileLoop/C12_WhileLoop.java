package myPraktice.day6_For_While_DoWhileLoop;

public class C12_WhileLoop {
    public static void main(String[] args) {
        /*
    While loop kullanarak 3'den
    13(dahil)'e kadar tum tek tamsayilari ekrana yazdirin
     */

        int bas=3;
        int bitis=13;
        int input=bas;


        while (input<=bitis){


            if (input%2!=0){
                System.out.print(input+" ");


            }
            input++;
        }



    }

}
