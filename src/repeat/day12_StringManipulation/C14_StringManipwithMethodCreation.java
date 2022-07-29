package repeat.day12_StringManipulation;

import java.util.Scanner;

public class C14_StringManipwithMethodCreation {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("bir string giriniz : ");
        String str= scan.nextLine().toLowerCase();

        // xyzVarmi1(str);

        System.out.println(xyzVarmi1(str));

    }

    public static boolean xyzVarmi1(String str) {

        if (str.contains("xyz")){
            return  true;

        }else
            return  false;

    }
}
