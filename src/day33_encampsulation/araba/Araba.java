package day33_encampsulation.araba;

public class Araba {
    String marka = "Marka belirtilmedi"; // markanin access modifier'i default
    // access modifier oldugundan, packge icerisinden kullanilabilir
    private String model = "Model belirtilmedi";
    private String yakit = "Elektrikli"; // tum arabalar elektirikli ise variablein
    //ise bu variable'in degistirilmemesi gerekir
    // private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim
    //model'e deger atanabilmesi


    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}
