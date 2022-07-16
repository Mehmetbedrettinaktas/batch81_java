package myPraktice_day04;

public class C08_Ocerloading {
    public static void main(String[] args) {



        String str ="Bu Java ogrenilecek, baska yolu yok";

        str.substring(2);
        str.substring(2,4);


        str.replace('c','v');
        str.replace("J","H");
        topla1(5,7);



    }

    public static void topla1(int sayi1, int sayi2) {
        System.out.println(" Iki integer'in toplami : "+ (sayi1 + sayi2));
    }

}
