package repeat.day17_NestedForLoop;

public class C05_NestedForLopp {
    public static void main(String[] args) {
        /*
        verilen input'a gore * lardan olusan asagidaki
        sekli olusturun
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*



         */
        // artan kismi nested forloop ile yapalim

        int input=5;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }

        // azalan kismi nested forloop ile yapalim
        for (int i = input-1; i >= 1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");

            }

            System.out.println("");

        }
    }
}
