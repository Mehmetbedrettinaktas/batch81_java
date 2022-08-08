package repeat.day36_InheritanceDataTypeKullanimi;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DIsci extends BMuhasebe{

    protected int saatUcreti =11;
    protected    int gunlukMesai=7;

    protected  void maasIsci() {
        System.out.println("Isciler: "+(30* saatUcreti * gunlukMesai) + " maas alir");

    }
    protected  void ozelSigortaIsci() {

        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1= new DIsci();
        System.out.println(isc1.gunlukMesai); // Muhasebeden 8
        System.out.println("isc1.saatUcreti = " + isc1.saatUcreti); //  Muhasebeden 10
        isc1.maas(); //  personel minimum : 2400 maas alir
        isc1.ozelSigorta(); //isteyen calisanlara %50 indirimli ozel sigorta yapilir
        isc1.sigorta(); // Tum personelimiz sigorta  yapilir
        System.out.println("isc1.isim = " + isc1.isim); // isc1.isim = Isim belirtilmedi
        System.out.println("isc1.soyisim = " + isc1.soyisim); // isc1.soyisim = Soyisim belirtilmedi
        System.out.println("isc1.departmant = " + isc1.departmant); // isc1.departmant = dapartman belirtilmedi


        APersonel isci2=new DIsci();
       // System.out.println(isci2.gunlukMesai); // Muhasebeden 8
       // System.out.println("isci2.saatUcreti = " + isci2.saatUcreti); //  Muhasebeden 10
        isci2.maas();
        //isci2.ozelSigorta();
        isci2.sigorta();
        System.out.println("isci2.isim = " + isci2.isim);
        System.out.println("isci2.soyisim = " + isci2.soyisim); //
        System.out.println("isci2.departmant = " + isci2.departmant);


        List<String> list1 = new LinkedList<>();
        Deque<String> list2= new LinkedList<>();
        Queue<String> list3= new LinkedList<>();
    }

}
