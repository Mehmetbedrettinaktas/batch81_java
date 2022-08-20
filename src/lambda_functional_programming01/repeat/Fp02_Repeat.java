package lambda_functional_programming01.repeat;

import java.util.ArrayList;
import java.util.List;

public class Fp02_Repeat {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);  // [8, 9, 131, 10, 9, 10, 2, 8]
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftElemanlariYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKarelriniYazdir(liste);
        System.out.println();
        tekrarsizTekElemanleinKupunuYazdir(liste);


    }

    // 1) Ardisik list elemanlarini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)
    public static void listElemanlariniYazdirFunctional(List<Integer> list) {
        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
        // 8 9 131 10 9 10 2 8
    }

    // 2) Ardisik cift list rlrmanlarini ayni satirda bosluk birakarak yazdiran bir method olusturun.(Functional)
    public static void ciftElemanlariYazdirFunctional(List<Integer> list) {
        list.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::ayniSatirdaBosluklaYazdir);
        // 8 10 10 2 8
    }

    // 3)  Ardışık tek list elemanlarinin karelerini aynı satırda aralarında
    // birakarak yazdiran bir method olusturun(Functional).
    public static void tekElemanlarinKarelriniYazdir(List<Integer> list) {
        list.stream().filter(Utils::tekElemaniSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
        // 81 17161 81
    }

    // 4) Ardisik tek list elemanlarinin karelerini tekrarsız olarak ayni
    // satirda bosluk birakarak yazdiran bir method olusturun
    public static void tekrarsizTekElemanleinKupunuYazdir(List<Integer> list) {
        list.stream().distinct().filter(Utils::tekElemaniSec).map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
        // 729 2248091
    }
}
