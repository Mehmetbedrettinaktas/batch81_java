package day21_Arrays;

public class C02_EnUzunVeKisaKelime {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen String bir array’de
        en uzun ve en kisa String’leri
        yazdiran bir method olusturun
         */
        String[]isimler={"Erdal","Onur", "Mehmet","Hayrullah","Mihrican"};

        enUzunVeKisayiYazdir(isimler);
    }

    public static void enUzunVeKisayiYazdir(String[] isimler) {

        String enUzunKelime=isimler[0];
        System.out.println("enUzunKelime = " + enUzunKelime); //Erdal
        String enKisaKelime=isimler[0];
        System.out.println("enKisaKelime = " + enKisaKelime); // enKisaKelime = Erdal

        for (int i = 1; i <isimler.length ; i++) {
            if (isimler[i].length()>enUzunKelime.length()){ // eger buraya >= koyarsak en son ki uzun kelimeyi alir. or :"Mihrican1"
                enUzunKelime=isimler[i]; // Hayrullah
            }
            if (isimler[i].length()<enKisaKelime.length()){
                enKisaKelime=isimler[i];
            }
        }
        System.out.print("Arraydeki en uzun kelime : "+enUzunKelime);
        System.out.println(" ");
        System.out.print("Arraydeki en kisa kelime : "+enKisaKelime);

    }
}
