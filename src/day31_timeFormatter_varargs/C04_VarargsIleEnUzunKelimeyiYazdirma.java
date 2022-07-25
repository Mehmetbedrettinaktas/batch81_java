package day31_timeFormatter_varargs;

public class C04_VarargsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir("Ali","Ayse","Ismail","Babayigit");

    }

    public static void enUzunKelimeyiYazdir(String... kelime) { // String ... kelime   Vararags dir,

        String enUzunKelime=kelime[0]; // ilk element en uzunmus gibi davranalim

        for (String each: kelime ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }


        }
        System.out.println("girilen kelimelerden en uzunu : "+enUzunKelime); // Ismail
        // Babayigit ekledik ve son en uzn kelime o oldu

    }
}
