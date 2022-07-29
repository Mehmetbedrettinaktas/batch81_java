package repeat.day10_StringMethod;

import java.util.Scanner;

public class C12_Switchcase {
    public static void main(String[] args) {

        /*
        Kullanicidan gun numarasini alip
        1 ise pazartesi
        ...
        7 ise pazar sayidirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir gun numarasini giriniz ");
        int gunNo = scan.nextInt();

        switch (gunNo) {

            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("cumartesi");
                break;
            case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun numarasini giriniz");

        }


    }
}
