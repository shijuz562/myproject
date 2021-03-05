package student;

public class Student{
    byte id;
    String name;
    byte mandarin;
    byte english;
    byte math;

    public Student(byte id ,String name){
        this.id = id;
        this.name = name;
    }

    public Student(byte id, String name, byte mandarin, byte english, byte math) {
        this(mandarin, english, math);
        this.id= id;
        this.name = name;
    }

    public Student(byte mandarin, byte english, byte math){

        this.mandarin = mandarin;
        this.english = english;
        this.math = math;
    }

    public float averang(){
        float average = (float)(mandarin + english + math) / 3;
        return average;
}
}