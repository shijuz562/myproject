package com.tom;

public class Hello{
    public static void main(String[] arg){
//        System.out.println("Hello Java and Kotlin");
//        new Person().hello();
//        Person p = new Person();
//        p.hello();
        int age = 23;
        Integer age2 = age;
        byte agebyte = age2.byteValue();
        System.out.println("My age byte is "+ agebyte);

        char gender = 'a' ;
        Character gender2 = gender;
        System.out.println("My gender is "+ gender2);

        String name = "aa";
        System.out.println("My name is "+ name);

        float weight = 69.8f;
        Float weight2 = weight;
        byte weightbyte = weight2.byteValue();
        System.out.println("My weight is "+ weightbyte);

        double height = 167.2;
        Double height2 = height;
        byte heightbyte = height2.byteValue();
        System.out.println("My height is " + heightbyte);

    }
}