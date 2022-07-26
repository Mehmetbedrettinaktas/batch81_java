package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("Ilk olusturulan tarih : "+tarihSaat);
        // Ilk olusturulan tarih : 2022-07-25T20:41:16.278730200


        // M==> Months, m==> minutes
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd//M/yy  hh:mm");
        System.out.println(dtf1.format(tarihSaat)); // 25//7/22  08:45
        // d  eger tek rakamdan olusan bir gundeyseniz 05 seklinde yaziyor.

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d//MMM/yyyy  hh:mm");
        System.out.println(dtf2.format(tarihSaat)); //25//Tem/2022  08:47


        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("d//MMMM/yyyy  HH:mm a");
        System.out.println(dtf3.format(tarihSaat)); //25//Temmuz/2022  20:49 pm
    }
}
