package day32_StringBulder;

public class C06_replace {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Calm down");

        sb.replace(5,10,"Up");
        System.out.println("sb = " + sb); // sb = Calm Up

        System.out.println("sb.replace(4,5,\"---\") = " + sb.replace(4,5,"---")); //Calm---Up

        /* replace ile nereyi degistirmek istediggimiz yeri degistiriyor.
        StringBuilder da istenen index'ler arasindaki bolumun yerine
        verilen String'i ekler


         */

        sb.replace(4,7," ");
        System.out.println("sb = " + sb); // Calm Up

        System.out.println("sb.replace(5,7,\"down\") = " + sb.replace(5,7,"down")); // Calm down


    }
}
