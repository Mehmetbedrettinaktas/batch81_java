package myPraktice_day03;

public class C01_PrePostIncrement {
    public static void main(String[] args) {

        // pre Increment önce deger artiriliyor sonra deger ataniyor
        int a=15;
        int b=++a;  // a= 16
        System.out.println(b); // b =16

        // post- Increment once deger ataniyor sonra deger artiriliyor.
        int x= 29;
        int y=x++;
        System.out.println(x); // x 30
        System.out.println(y); // y=29

        int sayi= 38/2*(4+3)*2;
        System.out.println(sayi);



    }
}
