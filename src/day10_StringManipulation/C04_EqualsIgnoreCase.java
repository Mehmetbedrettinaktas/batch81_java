package day10_StringManipulation;

public class C04_EqualsIgnoreCase {
    public static void main(String[] args) {

        String str1="Ali Can";
        String str2="ali Can";
        String str3="ALI CAN";
        String str4="Ali Can_";

        System.out.println(str1.equals(str2)); //false

        System.out.println(str1.equalsIgnoreCase(str2)); //true
        // equalsIgnoreCase() verilen iki string degiskeni
        // BUYUK HARF / kucuk harf farki gozetmeksizin karsilastirir
        //  metinler tamemen ayniysa sonuc true verir tek bir karekter fazla, eksik veya degisik olsa false verir.
        //

        System.out.println(str2.equals(str3)); //false
        System.out.println(str2.equalsIgnoreCase(str3)); //true

        System.out.println(str1.equals(str4)); //false
        System.out.println(str1.equalsIgnoreCase(str4)); //false




    }
}
