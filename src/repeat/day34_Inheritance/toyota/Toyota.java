package repeat.day34_Inheritance.toyota;

public class Toyota {

    protected String marka = "Corolla";
    protected String model = "Model belirtilmedi";
    protected String yakit = "Yakit belirtilmedi";

    protected void motor() {
        System.out.println("Toyota cevreci motorlar kullanir");
    }

    protected void aku(){
        System.out.println("Toyota modele gore aku kullanir");
    }


}
