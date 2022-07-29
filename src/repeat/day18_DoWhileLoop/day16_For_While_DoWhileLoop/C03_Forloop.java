package repeat.day18_DoWhileLoop.day16_For_While_DoWhileLoop;

public class C03_Forloop {
    public static void main(String[] args) {
        /*
        100'den baslayarak 50'ye kadar(dahil )kadar
        olan tamsayilari aralarinda virgul
        olarak ayni satirda yazdirin.
         */
        int bas =100;
        int son=50;

        for (int i =100 ; i >=50 ; i--) {
            if (i>son){
                System.out.print(i +", ");
            }else {
                System.out.println(i);
            }


        }
        System.out.println("");
    }
}
