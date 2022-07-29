package repeat.day32_StringBulder;

public class C06_Replace {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Calm down");

        System.out.println("sb.replace = " + sb.replace(5, 10, "Up"));
        //sb.replace = Calm Up

        System.out.println("sb.replace = " + sb.replace(4, 5, "---"));
        // sb.replace = Calm---Up

        System.out.println("sb.replace = " + sb.replace(4, 7, " "));
        // sb.replace = Calm Up

        System.out.println("sb.replace = " + sb.replace(5, 7, "down"));
        // sb.replace = Calm down
    }
}
