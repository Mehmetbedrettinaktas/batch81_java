package day31_timeFormatter_varargs;

public class C05_VarargsPrametreIleKullanma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir(5,"Ali","Ayse","Ismail","Babayigit","Akin");
                                        // ...kelime varargs elementidir

        /*
        Varargs teorik olarak sonsuz sayida element alabilir
        bir method'da parametre olarak varargs varsa
        vavargs'in sinirlarini bilebilmesi icin parameterlerin
        sonuncusu olmalidir.
        Oncesinde farkli parametreler olabilir ama varargs 'dan sonra parametre olamaz.

        Bu kuraldan dolayi bir method'ta birden fazla varargs olamaz.
         */
    }

    public static void enUzunKelimeyiYazdir(int kelimeSayisi,String... kelime) { // String ... kelime   Vararags dir,

        String enUzunKelime=kelime[0]; // ilk element en uzunmus gibi davranalim

        for (String each: kelime ) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }


        }
        System.out.println("girilen kelimelerden en uzunu : "+enUzunKelime); // Ismail

    }
}
