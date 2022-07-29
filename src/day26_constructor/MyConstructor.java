package day26_constructor;

public class MyConstructor {
    // Bu class calistiginda output ne olur?
    int x = 5;

    public MyConstructor() {                // constructor1  // 5.
        System.out.println("-x" + x); // -x5                  // 6.

    }

    public MyConstructor(int x) {        // constructor2          // 3.
        this();                                                   // 4.

        System.out.println("-x" + x);
    }

    public static void main(String[] args) {                        // 1.
        MyConstructor mc1 = new MyConstructor(4); // -x4            // 2. bizi constructor2 gon
        MyConstructor mc2 = new MyConstructor(); // -x5
    }
}
