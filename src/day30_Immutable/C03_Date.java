package day30_Immutable;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {

       LocalDate tarih = LocalDate.now(); // Java  bazen new Keyword ile bazen de bir class method
                                            // ile yeni bir obje olusturulur.

        System.out.println("tarih = " + tarih); // tarih = 2022-07-23  --> bugunun tarihi

        //tarih.getDayOfMonth();
        System.out.println(tarih.getDayOfMonth()); // 23 ayin gununu veriyor

        //tarih.getDayOfWeek();
        System.out.println(tarih.getDayOfWeek()); // SATURDAY  haftanin hangi gunu oldugunu gosteriyor


        //tarih.getDayOfYear();
        System.out.println(tarih.getDayOfYear()); // 204  yilin 365 gununde hangi gun numarasini veiyor.

        System.out.println(tarih.isLeapYear()); // false  .isLeapYear()   bu yilin  artik yil lup olmadigini bize gosteriyor

        LocalDate tarih2= LocalDate.of(2001,5,15);
        System.out.println("tarih2 = " + tarih2); //tarih2 = 2001-05-15

        LocalDate tarih3= LocalDate.of(1982, Month.APRIL,5);
        System.out.println("tarih3 = " + tarih3); // tarih3 = 1982-04-05

        System.out.println(tarih.plusDays(100)); // 2022-10-31         100 gun sonraki tarih
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12)); // 2027-11-04

        //tarih.minusWeeks(20);
        System.out.println(tarih.minusWeeks(20)); // 2022-03-05

        System.out.println(tarih.minusDays(100).minusMonths(5)); // 2021-11-14

        System.out.println(tarih.isAfter(tarih2)); // true

        // iki farkli dogum gunu girildiginde hangisinde doganin daha buyuk
        // oldugunu bulunuz
        // tarih2 ve tarih3 icin yapalim

        if ( tarih2.isAfter(tarih3)){
            System.out.println(tarih3 + " tarihinde dogan daha buyuk"); // 1982-04-05 tarihinde dogan daha buyuk
        } else if (tarih2.isBefore(tarih3)) {
            System.out.println(tarih2+ " tarihinde dogan daha buyuk");

        }else {
            System.out.println("iki tarih bir biriyle ayni");
        }


    }
}
