package day04_DataCasting.Again;

public class C03_dataCasting {
    public static void main(String[] args) {
         int sayi1 = 23;
         int sayi2= 5;
        System.out.println( sayi1/sayi2); // 4.6 degil 4 --> ikiside int oldugundan sonucu int olarak kabul edilir.

        System.out.println(25*7/3); // 58.666 --> 58

        double sayi3=5;
        System.out.println(sayi1/sayi3);  // 4.6 iki variable'in data turu degisk oldugunda
                                            // daha kapsamli olani data turu olarak kabul eder.


    }
}
