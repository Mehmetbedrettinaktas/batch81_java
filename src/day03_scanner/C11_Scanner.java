package day03_scanner;

import java.util.Scanner;

public class C11_Scanner {
    public static void main(String[] args) {
        /* Kullanicidan yaricapi isteyip cemberin cevresini
        ve dairenin alanini hesaplayip yazdirin. (π= 3)
           C = 2πr
            Alan= πr²
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ceberin yari capini giriniz");
            int yaiCap=scan.nextInt();
        System.out.println("Ceberin alani : "+ (3*2*yaiCap)+ "\nDairenin alani : "+ (3*yaiCap*yaiCap));
    }
}
