package myPraktice.day6_For_While_DoWhileLoop;

public class C08_ForLoop {
    public static void main(String[] args) {

        // input olarak verilen Stringi terse cevirip yazdiran bir method olusturun

        String input="Java gun gectikce guzellesiyor";

        String tersInput="";

        for (int i = input.length()-1; i>=0 ; i--) {
            tersInput +=input.substring(i,i+1);

        }
        System.out.println(tersInput);



    }
}
