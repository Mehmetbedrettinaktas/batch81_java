package repeat.day32_StringBulder;

public class C08_equals {
    public static void main(String[] args) {


        StringBuilder sb1= new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        System.out.println(sb1.equals(sb2)); // false

        System.out.println(sb1.equals(sb1)); // true

        System.out.println(sb1.equals(str)); // false

        System.out.println("sb1.compareTo(sb2) = " + sb1.compareTo(sb2)); //

        StringBuilder sb3= new StringBuilder("Jave");

        System.out.println("sb1.compareTo(sb3) = " + sb1.compareTo(sb3)); //-4

    }
}
