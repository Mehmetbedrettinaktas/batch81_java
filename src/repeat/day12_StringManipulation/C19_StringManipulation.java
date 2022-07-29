package repeat.day12_StringManipulation;

public class C19_StringManipulation {
    public static void main(String[] args) {
        //Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin

        String input= "Kaya";

        String tersInput= input.substring(3).toUpperCase()+  // A
                input.substring(2,3)+  // y
                input.substring(1,2)+ // a
                input.substring(0,1).toLowerCase(); // k kucuk olarak aldik
        System.out.println(tersInput);
    }
}
