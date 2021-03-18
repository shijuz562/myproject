package com.tom.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){

        int secret = new Random().nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        byte number = 0;
        while(number != secret){
            System.out.println("Please enter number: ");
            number = scanner.nextByte();
            if (number > secret){
                System.out.println("lower");
            }else if (number < secret){
                System.out.println("higher");
            }else {
                System.out.println("Great, a number is " + secret);
            }
        }
    }
}
