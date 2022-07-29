package repeat.day12_StringManipulation;

import java.util.Scanner;

public class C09_StringManipulation {
    public static void main(String[] args) {
        //Kullanicidan ismini ve soyisimi girmesini isteyin,
        // sonrasinda konsola tam ismini buyuk harfler ile yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen isminizi ve soyisminizi giriniz : ");
        String firstName=scan.nextLine(),  lastName=scan.nextLine();
        // multiple declaration

        String fullName=firstName.concat(" "+lastName).toUpperCase();
        System.out.println("fullName : "+fullName);


    }
}
