package repeat.qA11;

public class C03_MD_Arrays {

    public static void main(String[] args) {

        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int toplam = 0;
        for (int each : arr) {
            toplam += each;
        }
        double ortalama = toplam / arr.length;
        System.out.println("Dizinin ortama degeri = " + ortalama);

        for (int each1 : arr) {
            if (each1 > ortalama) {
                System.out.println("ortalamadan buyuk olan deger : " + each1);
            }

        }



    }


}
