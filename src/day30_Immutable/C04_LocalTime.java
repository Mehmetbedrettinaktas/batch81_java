package day30_Immutable;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1= LocalTime.now();
        System.out.println("time1 = " + time1); // suanki tam saati  time1 = 18:12:28.020169400

        /*
        Bizim olusturdugumuz date ve time canli saat veya tarih degildir
        LocalTime.now(); kullandigimiz satrda o anki tarih veya
        saati alip bizim variable'imiza store eder.
        time1 variable'inin degeri SABITTIR
         */

        Thread.sleep(3000); // Thread kodlarimizi bekletir // time1 = 18:14:03.735771100
        System.out.println("time1 = " + time1); // time1 = 18:14:03.735771100


        System.out.println(time1.getSecond()); // 34
        System.out.println(time1.plusSeconds(10000)); // 21:18:14.044254200 10000 saniye sonra

        System.out.println(time1.minusMinutes(200)); // 15:13:53.280182800 200 dak once


        System.out.println(time1.withHour(3)); //03:35:59.578109   suanki saati 03 yapip geri akalanini aynisini yazdi

    }
}
