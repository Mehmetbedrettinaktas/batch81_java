package day08_IfStatements.Again;

import java.util.Scanner;

public class C06_ArtikYil {
    public static void main(String[] args) {

        /*
        Kullanicidan artik olup olmadigini kontrol etmek icin yil girmesini isteyin

Kural 1: 4 ile bolunmeyen yillar artik yil degildir.
Kural 2: 4 ile bolunup 100 ile bolunmeyen yillar artik yildir.
Kural 3: 4'un kati olmasina ragmen 100 ile bolunebilen yillardan
sadece 400'un kati olan yillar artik yildir.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir yil giriniz");
        int yil = scan.nextInt();

        if (yil %4 !=0){
            System.out.println("artik yil degildir");
        } else if (yil%100 !=0) {
            System.out.println("Artik yil");
        } else if (yil%400 !=0) {
            System.out.println("Artik yil degildir");

        }else {
            System.out.println("Artik yil");
        }

    }
}
