package repeat.day4;

public class C07_ForLoop {
    public static void main(String[] args) {
        /*
        Soru 3) 100’den baslayarak 50’ye
        (dahil) kadar olan sayilari aralarinda
        virgul olarak ayni satirda
        yazdirin
         */
        int bas =100;
        int bitis=50;


        for (int i =bas; i >=bitis ; i--) {
            if (i>bitis){
                System.out.print(i+",");
            }else System.out.print(i);

        }
    }
}
