package myPraktice.day9_ArrayList;

public class C05_ForEach {
    public static void main(String[] args) {

        int [] sayilar ={2,3,4,1,5,7,6,5,4,3};

        int toplam=0;
        for (int each:sayilar
             ) {
            toplam +=each*each;

        }
        System.out.println("kareler toplami = " + toplam); // 190
    }
}
