package paking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PakingTest {
    @Test
    public void getDurationTest(){
        Car car = new Car("ATX-1960", LocalDateTime.of(2021,3,14,6,52,0));
        car.setLeave(LocalDateTime.of(2021,3,14,15,5,0));
        Assertions.assertEquals(493 ,car.getDuration());
    }
    @Test
    public void getPriceTest(){
        Car car = new Car("ATX-1960", LocalDateTime.of(2021,3,14,6,52,0));
        car.setLeave(LocalDateTime.of(2021,3,14,15,5,0));
        Assertions.assertEquals(Math.round((double)(493)/30)*30,car.getPrice());
    }
}
