package day33_encampsulation.tasit;

public class Tasit {

    private String tasitTuru;
   private boolean muayenesiVarmi;
   private int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }

    public void setTasitTuru(String tasitTuru) { // Tir
        this.tasitTuru = tasitTuru;
       /*
       getter method'u da tek bir satirlik islem yapiyor
       baska class'larin private oldugu icin erisemedigi
       tasitTuru bilgisini, class icinden alip
       istenen farkli class'lar return ediyor.


        return olmadığı icin bu methodun cağırıldığı
         tasitrunner classinden yazdirilama
        burada bir satırlık islem yapıyor o bir satırlık islemde
         bizim gönderdiğimiz parametreyi instence variable a atıyor.

        */
    }

    /*
    boolean variable'lar icin olusturulan getter ve setter
    method'larin ismi   isvariableIsmi seklinde olur.
     */
    public boolean isMuayenesiVarmi() {
        return muayenesiVarmi;
    }

    public void setMuayenesiVarmi(boolean muayenesiVarmi) {
        this.muayenesiVarmi = muayenesiVarmi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
