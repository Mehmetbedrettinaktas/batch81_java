package day33_encampsulation.tasit;

public class TasitRunner {
    public static void main(String[] args) {

        Tasit tst1= new Tasit();

        tst1.setTasitTuru("Tir");

        System.out.println("tst1.getTasitTuru() = " + tst1.getTasitTuru());
        // method call yapınca tasıt class ına gıdıyor
        // tasıt turu prıvate oldugu ıcın get
        // methodu tasıtturune ulasıyor
        // aracı oluyor ve publıc aracı
        // kendı class ından bılgıyı bıze getırdı

        // burada tasitTuru 'ne private oldugu icin ona ulasamiyoruz,
        // ancak ayni class'taki public gettasitTuru() method'un araciligiyla
        // tasitTuru variable na ulastim.


    }
}
