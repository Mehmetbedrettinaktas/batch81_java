package myPraktice.day1;

public class C21_indexOf {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";

        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf('r'));// 7
        System.out.println(str.indexOf("j")); // -1

        System.out.println(str.indexOf("mek")); //10

        System.out.println(str.indexOf("g",6)); //yazilan index'ten baslar
        System.out.println(str.indexOf("g", (6+1))); // yazilan index ("e", ilk_e+1) ten bir sonraki index'ten baslar

        // yukardaki str'de 2. ve 3. e'nin indexlerini bulun
        //2. ci e' bulmak icin 1.e'nin index'ine ihriyacim var
        System.out.println("*******************");

        int ilk_e= str.indexOf("e");
        int ikinci_e= str.indexOf("e", ilk_e+1);
        System.out.println(str.indexOf("e", ilk_e+1));


        if (ikinci_e==-1){
            System.out.println("verilen str'de 2.e yok");
        }else {
            int ucuncu_e = str.indexOf("e",ikinci_e+1);
            if (ucuncu_e==-1){
                System.out.println("verilen str'da 3. e yok");
            }else {
                System.out.println("verilen  str'daki 3.e'nin index'i : "+ucuncu_e);
            }
        }





    }
}
