package myPraktice_day02;

public class C20_indexOf {
    public static void main(String[] args) {
        String str = "java ogrenirsek, bu isi kapariz";
        char harf='t';
        System.out.println(str.indexOf("isi"));

        if (str.indexOf('t')==-harf){
            System.out.println("str deki bu harf mevcut degildir");
        }else {
            System.out.println("str deki bu harf mevcuttur");
        }
    }
}
