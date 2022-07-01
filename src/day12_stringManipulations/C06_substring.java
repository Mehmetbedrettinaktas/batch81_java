package day12_stringManipulations;

public class C06_substring {
    public static void main(String[] args) {

        String h1= "Hello";
        String h2=h1.substring(3,3);
        System.out.println(h2);

        String s= "JAVA";
        s=s.substring(4,8);
        s.toUpperCase();
        System.out.println(s);
    }

}
