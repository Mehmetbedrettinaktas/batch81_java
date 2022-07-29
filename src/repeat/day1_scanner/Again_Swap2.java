package repeat.day1_scanner;

public class Again_Swap2 {
    public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;

        sayi1=sayi2+sayi1;

        System.out.println(sayi1);
        sayi2=sayi1-sayi2;
        sayi1=sayi1-sayi2;
        System.out.println("Swap tan sonra sayi2 : "+sayi2);
        System.out.println("Swap tan sonra sayi1 : "+sayi1);
    }
}
