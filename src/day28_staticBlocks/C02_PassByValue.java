package day28_staticBlocks;

public class C02_PassByValue {
    public static void main(String[] args) {
    /*
        verilen bir fiyat icin %10 indirim yapan bir method olusturun
        -Method'da indirim uygulanan fiyati yazdiran
        -Method Call sonrasi orginal fiyati yazdiran ve method'da yapilan
        degisikligin orginal degeri degistirip degistirmedigini kontrol eder
    */
        double satisFiyati=100;
        double indirimOrani=10;

        System.out.println(indirimliFiyat(satisFiyati, indirimOrani)); //90.0
        System.out.println("saisFiyati = " + satisFiyati); // 100.0

        System.out.println(indirimliFiyat(satisFiyati, indirimOrani)); //90.0
        System.out.println("satisFiyati = " + satisFiyati);

        /*
        iki faekli method'ta satisFiyati isminde variable olabilir
        Java buna itiraz etmez cunku, scop'lari farklidir
         */



    }
    public  static  double indirimliFiyat(double orjinalFiyat, double indirimOrani){
        // methodumuz %10 indirimli yapip
        // yeni fiyati main method'a dondursun

        double satisFiyati =orjinalFiyat*0.9;
        // birinci scop'taki satisFiyati ile ikinci scop'takiyle
        // ayni degildir

        return satisFiyati;
    }

}
