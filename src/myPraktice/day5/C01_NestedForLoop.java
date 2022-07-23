package myPraktice.day5;

public class C01_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen string'deki kullanilan harfleri
        tekrarsiz olarak yazdirip
        kelimede kullanilan farkli harf sayisini veren bir method yaziniz

         */

        String input= "Java her zaman guzel";
        tekrasizYap1(input);

    }

    public static void tekrasizYap1(String input) {
        String benzersizinput="";


        String islenecekKelime=input.replaceAll("\\W","");
        System.out.print(islenecekKelime.substring(0,1));
        benzersizinput+=islenecekKelime.substring(0,1);

        for (int i = 1; i <islenecekKelime.length() ; i++) {
            if (!benzersizinput.contains((islenecekKelime.substring(i,i+1)))){
                System.out.print(", "+islenecekKelime.substring(i,i+1));
                benzersizinput+=islenecekKelime.substring(i,i+1);
            }

        }

        System.out.println("");
        System.out.println("input : " +input);
        System.out.println(" benzersiz input : "+benzersizinput);

    }
}
