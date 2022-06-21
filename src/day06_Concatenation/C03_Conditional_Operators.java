package day06_Concatenation;

public class C03_Conditional_Operators {
    public static void main(String[] args) {
        System.out.println(5+2==8); // false

        boolean sonuc1=5>4 && 7<9 && 6+3==9 && 5+2 !=8;
                    // T       T       T           T
        System.out.println(sonuc1); // sonuc1= true

        boolean sonuc2=5>4 && 7>9 && 6+3==9 && 5+2 !=8;
                    // T       F      T            T    ---> F
        System.out.println(sonuc2);  // sonuc2 = false


        boolean sonuc3= 5>4 & 7>9 & 6+3==9 & 5+2 !=8;

        System.out.println(sonuc3); // false


        int sayi3=15;
        // sayi3 'un 10 ile 20 araliginda oldugunu true diyerek dondurelim.
        // java uclu karsilastirma kabul etmez.
        // ikili karsilastirmalar yapip mantiksal operatorlerle birlestirmeliyiz.
        // genellikle bir araliktan bahsediyorsak genellikle && kullaniriz
        System.out.println(10< sayi3 && sayi3<20); // true

        int sayi4=5;
        // sayi4 'un 10 ile 15'in arasinda olmadigini true diyerek dondurelim.
        // bunu && ile yapamayiz. Ancak ||(or)=> veya operaturuyle yapabiliriz.

        System.out.println(sayi4<10 || sayi4>20 ); // true


    }
}
