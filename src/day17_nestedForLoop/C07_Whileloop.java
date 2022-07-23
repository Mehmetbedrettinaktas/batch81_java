package day17_nestedForLoop;

public class C07_Whileloop {
    public static void main(String[] args) {
        // 20 'den 50'e kadar cift sayilari yazdiralim(sinirlar dahil)

        // for Loop ile yapalim

        int bas=20;
        int bitis= 50;


        for (int i = bas; i <=50 ; i++) {
            if (i%2==0){
                System.out.print(i +" ");
            }

        }
        System.out.println("");


       int temp=bas;

        while (temp<=bitis){
            if (temp%2==0){
                System.out.print(temp+ " ");
            }
            temp++;
        }


    }
}
