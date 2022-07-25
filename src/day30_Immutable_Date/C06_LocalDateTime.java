package day30_Immutable_Date;

import java.time.LocalDateTime;

public class C06_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("tarihSaat = " + tarihSaat); // tarihSaat = 2022-07-23T18:40:20.801987500

        System.out.println(tarihSaat.plusMonths(3).plusHours(100)); // 2022-10-27T22:42:33.620402800

        System.out.println(tarihSaat.minusDays(100).plusHours(100)); // 2022-04-18T22:43:19.717518700

        System.out.println(tarihSaat.toLocalDate()); // 2022-07-23



    }
}
