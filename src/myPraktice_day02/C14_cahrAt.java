package myPraktice_day02;

public class C14_cahrAt {
    public static void main(String[] args) {
        String str = "Java ogrenmek ne guzel";
        System.out.println(str.charAt(0)); // ilk harfi yazdirir// J

        System.out.println(str.toUpperCase().charAt(7)); // R  atama olmadigi icin Stringimiz kalici olarak
                                                            // degismiyor sadrce bu islem icn degisiyor
        System.out.println(str.charAt(21)); // l
        System.out.println(str.charAt(22)); //  StringIndexOutOfBoundsException: String index out of range: 22


    }
}
