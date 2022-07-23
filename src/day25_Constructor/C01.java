package day25_Constructor;

public class C01 {

    /*
    java OOP konsept kullandigi icin olusturulan her bir cllas'in
    ihtiyac oldugunda obje uretilmesine uygun dizan etmemiz
    Ama her class'dan obje uretmeyebilir

    bunun icin Java ihtiyac halinde kullanilmasi icin
    her cllas'da default bir costructor koymustur.

    bu default constructor cllas'dan obje olusturuldugunda otomatik olarak calisir

    ornegin bu class'indan constructor gorunmemesine
    ragemen C02 class'inda icinde oldgumuz C91 class'indan bir
    obje uretebildik

    ******onemli****
    1- Bizim bir obje uretmek icin mutlaka bir constructor'a ihtiyacimiz var
    2- Biz Consturactor 'a ihtiyacimiz olan ozel bir parametre yazmazsak
    Java bizi icin bir default constructor uretir.
    3- gorunurde bir class'ta bir constructor yoksada Java oraya bir yedek
    constructor koymustur, ihriyac duyuldugunda kullanmak icin.
     */
    int sayi;
    public  void  denem(){
        System.out.println("C01 den deneme method calisir");
    }
}
