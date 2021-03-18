package paking;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Car {
    private String id;
    private LocalDateTime enter;
    private LocalDateTime leave;
    private int price = 30;

    public Car(String id, LocalDateTime time){
        this.id = id;
        this.enter = time;
    }

    public String getId(){
        return id;
    }

    public void setLeave(LocalDateTime leave){
        if (leave.isAfter(enter)){
            this.leave = leave;
        }
    }
    public long getDuration(){
        Duration duration = Duration.between(enter,leave);
        return duration.toMinutes();
    }

    public double getPrice(){
        long minute = getDuration();
        int pakingprice = (int)Math.round((double)minute / 30)* price;
        System.out.println(pakingprice);
        return pakingprice ;
    }


}
