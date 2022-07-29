package day25_Constructor;

public class C03 {

    /*
    proje olusturulurken bazi class'lar run etmek icin degil
    variable ve method olusturup bunlari
    baska class'lardan kullanmak icin olusturulur

    bu class'lari kaliphane olarak kullanmak icin kullanilir


    Default constructor, parametresizdir
    goremezsek bile ihtyac oldugunda calisir.

    Class icerisinde parametreli veya parametresiz
    herhangi bir constructor olusturursak
    java default constructor'i siler

     */

    C03(){

    }
    /*
    Olusturdugumuz parametresiz bu constructor
    Default constructor ile 1-1 aynidir.
    aynisi olabilir ancak Default degildir

    ama biz olusturdugumuzd icin buna default constructor
    demeyiz parametresiz constructor deriz.
     */
    String isim="Etka";
    public  void  method01(){
        System.out.println("C03 method calisti");
    }
}
