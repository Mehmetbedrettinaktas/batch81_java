package repeat.day7_ifElseStatements;

public class C01_And_Operators {
    public static void main(String[] args) {
        // && hem ...hem anlamindadadir.
        // || veya anlaminda kullanir.

        int a =10;;
        int b=15;
        int c=20;

        System.out.println(a>20 && b<20 &&c>=b); //false



        System.out.println(a<20 && b<20 &&c>=b); //true

        System.out.println(a<20 & b<20 & c>=b); // true
    }
}
