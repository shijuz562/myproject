package student;

import java.sql.SQLOutput;

public class Runner{
    public static void main(String[] args){
        byte id = 1;
        byte mandarin = 58;
        byte english = 23;
        byte math = 68;
        Student stu = new Student(id, "alan", mandarin, english, math);
        System.out.println(stu.averang());
    }
}