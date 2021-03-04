package com.tom;

import com.sun.image.codec.jpeg.TruncatedFileException;

import java.util.Locale;

public class Hello{
    public static void main(String[] arg){
//        System.out.println("Hello Java and Kotlin");
        new Person().hello();
        Person p = new Person();
        p.name = "沈俊璋";
        p.weight = 68.5f;
        p.height = 1.68f;
        System.out.println(p.bmi());

      /*  byte age = 23;
        Byte byteage = age;
        byteage = byteage.byteValue();

        short month = 05;
        Short shortmonth = month;

        int day = 15;
        Integer intday = day;
        intday = intday.intValue();

        long year = 1998;
        Long longyear = year;
        longyear = longyear.longValue();

        char first = '沈';
        Character firstname = first;
        firstname = firstname.charValue();

        String lastname = "俊璋";

        float weight = 64249.61234f;
        Float floatweight = weight;
        floatweight = floatweight.floatValue();

        double height = 168.2;
        Double doubleheight = height;
        doubleheight = doubleheight.doubleValue();

        boolean a = true;
        Boolean aa = a;
        aa = aa.booleanValue();

        boolean b = false;
        Boolean bb = b;
        bb = bb.booleanValue();

        System.out.println("My name is "+ firstname + lastname);
        System.out.println("My age is "+ byteage);
        System.out.println("My 生日 is "+ longyear + shortmonth + intday);
        System.out.println("My weight is "+ floatweight);
        System.out.println("My height is "+ doubleheight);
        System.out.println("I is 畢業 "+aa);
        System.out.println("I is 上課 "+bb);*/

    }
}