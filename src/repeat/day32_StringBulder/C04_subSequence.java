package repeat.day32_StringBulder;

public class C04_subSequence {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("kayra");
        sb.substring(0,3);

        System.out.println("sb = " + sb); // kayra

        sb.subSequence(0,3);
        System.out.println("sb = " + sb); // kayra

        System.out.println("SubSequence = "
                + sb.subSequence(0,3)); // SubSequence = kay



    }
}
