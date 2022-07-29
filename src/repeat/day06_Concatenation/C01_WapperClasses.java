package repeat.day06_Concatenation;

import java.util.Scanner;

public class C01_WapperClasses {
    public static void main(String[] args) {
        String str = "Java ile hayat ne güzeldir";
        System.out.println(str.toUpperCase());

        boolean guzelMi= true;
        Boolean buguzelMi=true;
        buguzelMi.toString();
        System.out.println(buguzelMi);

        String ogrNo="123456";
        // kullanicidan bir sifre isteyin eger sifre rakamlardan
        // olusuyorsa kabuletmeyin.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sifre giriniz");

        String sifre=scan.nextLine();
        Integer sifresayi=Integer.parseInt(sifre);

        System.out.println("girilen sifrenin 3 fazlasi : "+(sifre+3));
        System.out.println("Integer sifrenin 3 fazlasi : "+(sifresayi+3));

    }
}
