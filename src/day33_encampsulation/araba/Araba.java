package day33_encampsulation.araba;

public class Araba {
    String marka = "Marka belirtilmedi"; // markanin access modifier'i default
    // access modifier default oldugundan, packge icerisinden kullanilabilir
    private String model = "Model belirtilmedi";
    private String yakit = "Elektrikli"; // tum arabalar elektirikli ise variablein
    //ise bu variable'in degistirilmemesi lazim
    // private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim
    //model'e deger atanabilmesi ama gorulemesin (setter)
    //Yakit ise gorulebilsin ama yeni deger atanmasini istenmiyor.(getter)



    public void setModel(String model) {
        this.model = model;
    }
    // Set method() ulasima izin veriyordu.
    public String getYakit() {
        //get method() deger atamaya izin veriyordu.
        return yakit;

    }


}
