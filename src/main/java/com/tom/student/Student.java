package com.tom.student;

public class Student{
    byte mandarin;
    byte english;
    byte math;
    float averang;
    byte high;
    char grading;

    public Student(byte mandarin, byte english, byte math){
        this.mandarin = mandarin;
        this.english = english;
        this.math = math;
    }
    public void print(){
        System.out.println(mandarin + " + " + english + " + " + math + "\taverang = " + averang() +
                        "\thigh = " + high() + "\tgrading = " + grad());
    }

    public float averang(){
        averang = (float)(mandarin + english + math) / 3;
        return averang;
}

    public byte high(){
        high = (mandarin > english) ? mandarin : english;
        high = (high > math) ? high : math;
        return high;
    }

    public char grad(){
        switch ((byte)averang /10){
            case 10:
            case 9:
                grading = 'A';
                break;
            case 8:
                grading = 'B';
                break;
            case 7:
                grading = 'C';
                break;
            case 6:
                grading = 'D';
                break;
            default:
                grading = 'F';
        }
        return grading;
    }
}