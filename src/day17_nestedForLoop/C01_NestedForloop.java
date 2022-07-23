package day17_nestedForLoop;

public class C01_NestedForloop {
    public static void main(String[] args) {
        // verilen String'deki kullanilan harfleri
        // tekrarsiz olarak yazdiran
        // kelimede kullanilan farkli harf sayisini veren bir method yaziniz

        /*
        Bize ne lazim;
        1- bir String lazim
        2- tekrarsiz harf yazdiran bir method lazim.
         */
        String input="Java her zaman cok guzel";

        tekrarsizYap(input);



    }

    public static void tekrarsizYap(String input) {
        String benzersizInput=""; // isleme etkisi olmamasi icin hiclik "" deger atadik

        String islenecekKelime=input.replaceAll("\\W",""); //Javaherzamanguzel
        System.out.println(islenecekKelime.substring(0,1)); // J            ilk harfi basta yazdirmasak harf + , olacak ve
        benzersizInput += islenecekKelime.substring(0,1); // J                en sonada bir , eklemis olacak


        for (int i = 1; i <islenecekKelime.length() ; i++) { // 1 index ten basladik cunku ilk index'i yukarda kullanandik

            if (! benzersizInput.contains(islenecekKelime.substring(i,i+1))){ // tekrarsiz kareteri bulmak icin i +(i+1) kullaniyoruz
                                                                                // java soldan saga yukaridan asagiya dogru calisir
                System.out.print(", "+islenecekKelime.substring(i,i+1));
                benzersizInput +=islenecekKelime.substring(i,i+1);

            }

        }

        System.out.println("");
        System.out.println("input: "+ input);
        System.out.println("benzersizInput : " + benzersizInput);
    }
}
