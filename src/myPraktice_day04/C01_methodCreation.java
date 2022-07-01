package myPraktice_day04;

public class C01_methodCreation {
    public static void main(String[] args) {
        // input olarak verilen 4 harfli bir stringi
        // tersten yazdiran bir method olusturalim

        terstenYazdir1("Selo");

    }

    public static void terstenYazdir1(String input) {
         String tersInput= input.substring(3)
                 + input.substring(2,3)+
                 input.substring(1,2)+
                 input.substring(0,1);

        System.out.println(" verilen kelimenin tersten yailmasi: "+tersInput);





    }
}
