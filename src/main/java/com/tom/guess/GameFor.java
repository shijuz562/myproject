package com.tom.guess;

import java.util.Scanner;
import java.util.Random;

public class GameFor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int secret = new Random().nextInt(100)+1;

        for (int i=1, num=0; i<=10 ; i++) {
            System.out.print("Please enter a number(" + i + "/10): ");
            num = scanner.nextByte();
            if(i == 10 && num != secret){
                System.out.println("you lost");
                break;
            }
            if (num < secret) {
                System.out.println("higher");
            } else if (num > secret) {
                System.out.println("lower");
            } else{
                System.out.println("Gread, a number is " + secret);
                break;
            }
        }
    }
}
