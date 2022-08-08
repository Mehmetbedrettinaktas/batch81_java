package day33_encampsulation;

import java.util.Random;
import java.util.Scanner;


public class C06_BlnmynKelime {

    public static void main(String[] args) {

        theWordGame("la belle vie"); // kelime oyunu methodu

    }
	/*
	 							The Wheel Of Fortune Game (TWOF):
  1) Oyunun başında ağaç hayatlarınız var. Doğru harfi bulamıyorsanız
 Bir canlıyı kaybedeceksin.
 2) TWOF'tan gelmesi muhtemel noktalar şunlardır:
 {100,200,300,400,500,600,700,800,900,1000,5000,1000,10000,IFLAS,PASS};
 3) TWOF'tan aldığınız puan, bulduğunuz harf sayısı ile çarpılmalıdır.
 4) İflas ederse, oyunu hemen kaybedersiniz.
 5) theWordGame("la belle vie"); Bu yöntemi dediğimizde oyun yüklenmiş oluyor
 bu cümle üzerine
	 */

    static void theWordGame(String word) { // theWohrdGame methodu sintring bir parametre tanimliyoruz

        Scanner scan = new Scanner(System.in);

        word = word.toUpperCase();
        StringBuilder unknownword = new StringBuilder(word.replaceAll("\\S", "-"));
        //  \\S bosluk disindaki tum karekterleri siler
        System.out.println("unknownword = " + unknownword);
        String live = "♥♥♥";
        boolean ifCorrect = false;
        int wof = 0;
        int score = 0;

        System.out.println(live);

        while (unknownword.toString().contains("-")) {
            //contains() methodu verilen Stringin'in istenen kareter(ler)i icerip
            // icermedigini kontrol eder. iceriyorsa TRUE, icermiyorsa FALSE dondurur

            System.out.println("****** Your score is " + score + " ******");

            wof = wheelOfFortune(); // carkifelek

            if (wof == 0) {
                System.out.println("The wheel of fortune is BANKRAPT");
                live = lostLive(live);
                System.out.println(live);
                System.out.println("You lost!!!"); // kaybetin
                break;

            }
            if (wof == 1) {
                System.out.println("The wheel of fortune is PASS");

                continue;

            }
            // wof
            System.out.println("The wheel of fortune is " + wof); // sans carki
            System.out.println(unknownword);

            System.out.println("Enter a letter..."); // Bir harf girin
            char l = scan.next().toUpperCase().charAt(0);

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == l) {
                    unknownword.setCharAt(i, l);
                    ifCorrect = true;
                    score = score + wof;
                }
            }

            if (ifCorrect == false) {
                live = lostLive(live);
                if (live.length() == 0) {
                    System.out.println("You lost!!!");
                    break;
                }
                System.out.println(live);
            }

            ifCorrect = false;
        }
        if (!unknownword.toString().contains("-")) {
            System.out.println(unknownword);
            System.out.println("Congrulations, you did it, your score is " + score);
        }
        scan.close();
    }

    public static int wheelOfFortune() {
        Random rdm = new Random();
        int[] wof = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 5000, 10000, 0, 1};
        int idx = rdm.nextInt(14);
        return wof[idx];
    }

    public static String lostLive(String s) {
        StringBuilder live = new StringBuilder(s);
        live.deleteCharAt(0);
        return live.toString();
    }
}



