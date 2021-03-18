package com.tom;

import com.sun.image.codec.jpeg.TruncatedFileException;

import java.util.Locale;
import java.util.Scanner;

public class Hello{
    enum type{enter,leave}
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter 1 or 2: ");
        int i = scanner.nextInt();
        switch (i){
            case 1: type a = type.enter;
                System.out.println(a); break;
            case 2: type b = type.leave;
                System.out.println(b); break;
        }


    }
}

