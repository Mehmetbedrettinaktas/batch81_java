package day14_MethodCreation;

import day13_methodCreation.C04_MethodCreation;

public class C01_methodcreation {
    public static void main(String[] args) {
        // input olarak verilen 4 harfli bir stringi
        // tersten yazdiran bir method olusturalim
        terstenYazdir("Okan");
        C04_MethodCreation.topla(6,5); //11 Diger taraftan (day13 C04 class)cagirdik
    }
    public static void terstenYazdir(String input){
        String tersInput= input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println("Verilen kelimenin tersten yazilisi : " + tersInput);


    }
}
