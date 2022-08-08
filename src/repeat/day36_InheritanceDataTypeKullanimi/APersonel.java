package repeat.day36_InheritanceDataTypeKullanimi;

public class APersonel {

    String isim="Isim belirtilmedi";
    String soyisim ="Soyisim belirtilmedi";
    String departmant ="dapartman belirtilmedi";

    protected  void maas() {
        System.out.println("Tum personelimiz maas alir");
    }
    protected  void sigorta() {
        System.out.println("Tum personelimiz sigorta  yapilir");
    }

}
