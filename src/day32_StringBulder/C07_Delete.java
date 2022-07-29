package day32_StringBulder;

public class C07_Delete {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java her zaman guzeldir");

        System.out.println("sb.delete(8,9) = " + sb.delete(8, 9)); // Java herzaman guzeldir

        System.out.println("sb.deleteCharAt(7) = " + sb.deleteCharAt(7)); // Java hezaman guzeldir

        // basta baslayarak her loop'da ilk harfi silip kalani yazdiralim

        int son= sb.length();

        for (int i = 0; i <son ; i++) {
            sb.deleteCharAt(0);
            System.out.println("sb = " + sb);
            // methodlar bize StringBuilder donduruyorsa string degisir,
            //String donduruyorsa sitring degismez.

        }

    }
}
