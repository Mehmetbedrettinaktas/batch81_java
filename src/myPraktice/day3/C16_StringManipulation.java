package myPraktice.day3;

import java.util.Scanner;

public class C16_StringManipulation {
    public static void main(String[] args) {
          /*
        Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("lutfen bir kelime giriniz : ");
        String kelime= scan.next();
       char ortaKarekter=kelime.charAt((kelime.length()-1)/2);

       if (kelime.length()%2==1 && kelime.length()>=3){
           System.out.println("ortanca karekter : "+ortaKarekter);
       }

    }
}
