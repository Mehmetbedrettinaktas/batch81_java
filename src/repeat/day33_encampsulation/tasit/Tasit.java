package repeat.day33_encampsulation.tasit;

public class Tasit {

   private String tasitTuru;
    private boolean muayenesiVarmi;
    private int yil;

    public String getTasitTuru() {
        return tasitTuru;
    }

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;
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
