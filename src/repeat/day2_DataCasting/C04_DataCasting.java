package repeat.day2_DataCasting;

public class C04_DataCasting {
    public static void main(String[] args) {

        byte sayi1= 23;
        short sayi2 =55;

        int sayi3 = sayi1 + sayi2;  // 78

        double sayi4 = sayi2*sayi1; // 2.391
        System.out.println(sayi4);

        sayi4 = (double) sayi2/sayi1;  // = .391304347826087    once islem sonra deger atar
        System.out.println(sayi4);  // 2.0

    }
}
