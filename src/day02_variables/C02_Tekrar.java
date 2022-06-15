package day02_variables;

public class C02_Tekrar {
    public static void main(String[] args) {
         int         not                =               60              ;
        //data turu  variables ismi   assigment sign variable degeri    islem bitti isareti.

            int not2= 70;
        //variable  deger
        // java once degeri hesaplar sonra assign islemini yapar
        // no2'yi 80 yapalim

        not2=90;

        // yeni bir int variable olusturalim degeri ilk iki variable'in ortalamsi olsun

        int ort=(not + not2)/2;
        System.out.println(ort);
        // " " icinde yazilan hersey metindir, java " " icinde ne gorurse o sekilde yazdirir.
        // eger bir veriable 'in degerini yazdirmak istiyorsaniz
        // " " olmadan variable ismini yazmalisiniz.


            String firstName="Mehmet";
            String lastName=" Aktas";
        System.out.println(firstName + lastName);

        int number1 =25;
        int number2 =39;
        System.out.println(number1+number2);
        int top = number1+number2;
        System.out.println(top);

        double ondalik=33.4;
        System.out.println(ort+ondalik);
        char karekter='A';
        System.out.println(karekter);

        System.out.println(top + karekter);


    }
}
