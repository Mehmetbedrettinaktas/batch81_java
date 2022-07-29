package day32_StringBulder;

public class C04_subSequence {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Kayra");

        sb.substring(0,3);
        // Bu method String dondurdugu icin StringBuilder'in
        // eski halini degistiremez.


        System.out.println("sb = " + sb);// Kayra

        sb.subSequence(0,3);
        System.out.println("sb = " + sb); // Kayra

        System.out.println("SubSequence = "
                + sb.subSequence(0,3)); // SubSequence = kay


    }
}
