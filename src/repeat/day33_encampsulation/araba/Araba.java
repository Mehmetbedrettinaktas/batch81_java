package repeat.day33_encampsulation.araba;

public class Araba {
    String markaa="Markaa belirtilmedi";
    private String model= "Model belirtilmedi";
   private String yakit= "Elektririkli";

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}
