package day07_IfStatements;

public class C01_AndOperatorleri {
    public static void main(String[] args) {
        int a =10;
        int b=15;
        int c=20;
        System.out.println(a>0 && b<20 && c>=b); // true
                        // true     true    true --> t
        System.out.println(a<0 && b<20 && c>=b); // false
                        // false    true   true   sonuc --> false

        /*
        java and opertoru konusunda bize ik secenek sunar
        && kullanirsak, ilk false buldugunda artik sonucu buldugunda, artik sonucu false olacagini bilir
        ve geriye kalan sartlari incelenmez.
        & kullanirsak tum sartlari kontrol eder sonra sonucu belirler
        bu calisma usulunden dolayi & operatoru, && operatorune gore daha yavas olabilir.
         */
        System.out.println(a<0 & b<20 & c>=b);



        }
}
