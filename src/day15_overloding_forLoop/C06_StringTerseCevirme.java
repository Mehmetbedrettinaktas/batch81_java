package day15_overloding_forLoop;

public class C06_StringTerseCevirme {
    public static void main(String[] args) {

        // input olarak verilen Stringi terse cevirip yazdiran bir method olusturun

        String input="Java gun gectikce guzellesiyor";
       terstenYazdir2(input);
    }

    public static void terstenYazdir2(String input) {
       // String tersIinput= input.substring(input.length()-1); // 1. yontem
        String tersIinput="";  //2. yontem

        for (int i = input.length()-2; i>=0 ; i--) {  // her zaman -2 den basliyoruz
            tersIinput +=input.substring(i,i+1);

        }
        System.out.print("tersIinput = " + tersIinput);
    }
}
