package day32_StringBulder;

public class C03_reverse {
    public static void main(String[] args) {
        // verilen bir input'u tersine cevirip,
        // bize donduren bir method olusturun

    String input ="Hey gidi for loop gunleri";

    String tersInput= tersineCevir(input);

        System.out.println("tersInput = " + tersInput); // irelnug pool rof idig yeH

    }

    public static String tersineCevir(String input) {

        StringBuilder sb = new StringBuilder(input);

        return sb.reverse().toString();


    }
}
