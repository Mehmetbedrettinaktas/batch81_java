package day33_encampsulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Bilinmeyenkelime {



        public static void main(String[] args) {
            String kelime = "nagihan";
            int i, tahmin = 0, anahtar = 0, dogru = 0;
            String harfler[] = new String[kelime.length()];

            System.out.println("Kelimeyi bulmak için 3 yanlış hakkınız var.");
            BufferedReader klavye = new BufferedReader(new InputStreamReader(System.in));

            for (i = 0; i < kelime.length(); i++) {
                harfler[i] = "_ ";

            }

            finish: while (tahmin < 4) {
                System.out.println("Bir harf giriniz (Kalan hakkiniz " + (3 - tahmin) + ") : ");
                String harf = "";
                try {
                    harf = klavye.readLine();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                tahmin++;
                for (i = 0; i < kelime.length(); i++) {
                    if (kelime.charAt(i) == harf.charAt(0)) {
                        harfler[i] = harf + " ";
                        anahtar = 1;
                        dogru++;
                        if (dogru == kelime.length()) {
                            System.out.println("kelime " + kelime + "...Tebrikler...");
                            break finish;
                        }
                    }
                }
                if (anahtar == 1) {
                    anahtar = 0;
                    tahmin--;
                }
                for (i = 0; i < kelime.length(); i++) {
                    System.out.print(harfler[i]);

                }
                System.out.println();
            }
            if (dogru != kelime.length()) {
                System.out.println("Uzgunum... Dogru yanit " + kelime);
            }

            //nagihanesendal.blogspot.com

        }

    }

