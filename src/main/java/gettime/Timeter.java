package gettime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Timeter {
    LocalDateTime now = LocalDateTime.now();

    public short year(){
        return (short)now.getYear();
    }

    public String month(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM");
        Month a = now.getMonth();
        return format.format(a);
    }

    public byte day(){
        return (byte)now.getDayOfMonth();
    }

    public byte hour(){
        return (byte)now.getHour();
    }

    public byte minute(){
        return (byte)now.getMinute();
    }

    public byte second(){
        return (byte)now.getSecond();
    }

    public byte week(){
        DayOfWeek weektmp = now.getDayOfWeek();
        return (byte)weektmp.getValue();

    }

}
