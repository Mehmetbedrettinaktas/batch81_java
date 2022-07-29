package repeat.day18_DoWhileLoop.day16_For_While_DoWhileLoop;

public class C02_ForLoop {
    // 10 ile 30 arasindaki (10 ve 30 dahil)
    // sayilari aralarinda virgul olarak ayni satirda yazdirin
    public static void main(String[] args) {

        int bas=10;
        int bitis =30;

        for (int i = bas; i <=bitis ; i++) {


            if (i < bitis) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("");
    }


}
