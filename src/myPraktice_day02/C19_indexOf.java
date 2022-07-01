package myPraktice_day02;

public class C19_indexOf {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf('g'));
        System.out.println(str.indexOf("t"));

        String str5= "kdfeuifwepifaölrerirzaöp:vmvjfjk";
        if (str5.indexOf("p")==-1){
            System.out.println("str5'te istenen karekter kullanilmamistir.");
        }
        else {
            System.out.println("str5 deistenen karekter kullanilmistir");
        }


    }
}
