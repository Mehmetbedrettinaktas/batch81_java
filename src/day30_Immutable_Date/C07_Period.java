package day30_Immutable_Date;

import java.time.LocalDate;
import java.time.Period;

public class C07_Period {
    public static void main(String[] args) {
        /*
        iki tarih arasindaki sureyi bulma
         */
        LocalDate tarih1=LocalDate.of(1982,5,05);
        LocalDate bugun=LocalDate.now();

        Period period= Period.between(tarih1,bugun);

        System.out.println("period = " + period); // period = P-40Y-2M-18D

        System.out.println(period.getYears()); // 40



    }
}
