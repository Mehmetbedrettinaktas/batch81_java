package repeat.day32_StringBulder;



public class C03_reverse {
    public static void main(String[] args) {
        //verilen bir input'u tersine cevirip,
        // bize donduren bir method olusturun

        String input= "Hey gidi for loop gunleri";
        
        String tersInput=tersineCevir1(input);
        System.out.println("tersInput = " + tersInput); // tersInput = irelnug pool rof idig yeH
    }

    private static String tersineCevir1(String input) {
        StringBuilder sb = new StringBuilder(input);
       return sb.reverse().toString();  // StringBuilder 'i String'e ceviriyoruz.

    }
}
