package day07_IfStatements;

import java.util.Scanner;

public class C05_If_Else_Statements {
    public static void main(String[] args) {
        /*
        Kullanicidan bir karakter girmesini isteyin ve
        girilen karakterin harf olup olmadigini yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karekter giriniz");
        char harf = scan.next().charAt(0);

        if (harf >= 'a' && harf <= 'z' || (harf >= 'A' && harf <= 'Z')) {
            System.out.println("Girilen karekter bir harf");

        } else {
            System.out.println("Girilen karekter bir harf degildir");
        }
    }
}
