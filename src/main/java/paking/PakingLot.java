package paking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class PakingLot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Car> car = new ArrayList();
        byte option = 1, size = 0;
        while(option != 0 && size <= 10){
            System.out.printf("1. Enter(%d/10)\n" +
                              "2. Leave\n" +
                              "0. Exit\n" +
                              "Please enter a number: ",size);
            option = scanner.nextByte();
            if (size == 10 && option == 1){ System.out.println("Sorry，This parking lot is full"); continue; }
            if (size == 0 && option == 2){ System.out.println("no car"); continue;}
            switch (option){
                case 1:{
                    System.out.print("id: ");
                    car.add(new Car (scanner.next(),LocalDateTime.now()));
                    size = (byte)car.size();
                    break;
                }
                case 2:{
                    System.out.print("Please enter your id: ");
                    String leaveid = scanner.next();
                    byte num = 0;
                    for(Car leavecar : car){
                        if (leavecar.getId().equals(leaveid)){
                            leavecar.setLeave(LocalDateTime.now());
                            leavecar.getPrice();
                            car.remove(leavecar);
                            size = (byte)car.size();
                            num = 1;
                            break;
                        }
                    }
                    if (num == 0){ System.out.println("No this car"); }
                    break;
                }
            }
        }
        System.out.println("application has ended");
    }
}
