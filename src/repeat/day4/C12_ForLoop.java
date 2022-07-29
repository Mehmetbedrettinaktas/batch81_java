package repeat.day4;

public class C12_ForLoop {
    public static void main(String[] args) {
        /*
        Soru 9 ) Interview Question Kullanicidan bir String isteyin.
        Kullanicinin girdigi String’in palindrome
        olup olmadigini kontrol eden bir program yazin
        tras adama sart
         */

        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
        String str = scan.nextLine();

         */
        // mom, dad, , poop, race car, nurses run ,Kazak
        String str = "dad";
        str = str.replace(" ", "");
        String tersten = "";

        //for (int i = str.length() - 1; i >= 0; i--) {
        //    tersten += str.charAt(i);
        //    System.out.println(tersten);

        //}
        // System.out.println("");
        boolean palondrome = true;
        for (int i = 0; i < str.length(); i++) {
            tersten += str.charAt(i);


            if (str.charAt(i) == tersten.charAt(i)) {
                System.out.println("PALINDROME ");
            }else {
                System.out.println("PALINDROME degil!");
            }
        }
        System.out.println("");

    }

}


