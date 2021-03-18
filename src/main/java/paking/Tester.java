package paking;

import gettime.Timeter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;


public class Tester {
    public static void main(String[] args) {
//        timd();
//        newtime();
        Timeter time = new Timeter();
        System.out.println(time.year());
        System.out.println(time.month());
        System.out.println(time.day());
        System.out.println(time.hour());
        System.out.println(time.minute());
        System.out.println(time.second());
        System.out.println(time.week());


    }

    private static void newtime() {
        Instant instant = Instant.now();
        System.out.println(instant);
        LocalDateTime local = LocalDateTime.now();
        System.out.println(local);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:yy");
        System.out.println(formatter.format(local));
        LocalDateTime add =  local.plus(Duration.ofHours(5));
        System.out.println(add);
    }

    private static void timd() {
        Date date = new Date();
        System.out.println(date.getTime());
        SimpleDateFormat simple = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" );
        System.out.println(simple.format(date.getTime()));
        String da = "2021/03/14 12:50:30";
        try {
            System.out.println(simple.parse(da));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(simple.format(calendar.getTime()));
        calendar.set(calendar.YEAR,2022);
        System.out.println(simple.format(calendar.getTime()));
        calendar.add(calendar.MONTH,1);
        System.out.println(simple.format(calendar.getTime()));
    }
}
