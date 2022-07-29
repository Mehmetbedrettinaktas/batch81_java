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
        //return olmadığı icin bu methodun cağırıldığı
        // tasitrunner classinden yazdirilamaz

        //burada bir satırlık islem yapıyor o bir satırlık islemde
        // bizim gönderdiğimiz parametreyi instence variable a atıyor.
    }

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
