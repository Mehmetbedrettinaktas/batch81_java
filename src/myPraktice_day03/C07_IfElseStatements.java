package myPraktice_day03;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan bir karekter girmesini isteyin ve
        girilen karekterin harf olup olmadigini yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir karekter giriniz:  ");
        char karekter=scan.next().charAt(0);

        if ((karekter>='a' && karekter<='z')|| (karekter>='A' && karekter<='Z')){
            System.out.println("Girilen "+ karekter+ " karekteri harftir.");
        }else {
            System.out.println("Girilen "+ karekter+ " karekteri harf degil.");
        }

    }
}
