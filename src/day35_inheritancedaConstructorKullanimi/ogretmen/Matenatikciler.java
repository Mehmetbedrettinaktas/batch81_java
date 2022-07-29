package day35_inheritancedaConstructorKullanimi.ogretmen;

public class Matenatikciler extends LOgretmen{

    Matenatikciler(){
        // burada parametresiz super() constructor var
        System.out.println("Matenatik parametresiz constructor");
    }

    Matenatikciler(String isim){
        this(); // bu class taki constructor'a git.

        System.out.println("Matenatik parametremetreli constructor");
    }


    public static void main(String[] args) {
        Matenatikciler obj1= new Matenatikciler("Tugba");
    }
    /*
    this() constructor call, icinde bulunulan class'daki
    constructorla super() ise paret class'da bulunan constructor
    cagirir

    this() veya super() parametre yapisina uygun bir constructor
    bulamazsa Java CTE verir.

    constructor konusunda gordugumuz this. o class'taki instance
    veraiable'lari refere ediyor

    inheritance'da super. vardir
     */

}
