package com.tom;

import com.tom.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    Student stu = new Student((byte)60,(byte)70,(byte)80);
    @Test
    public void gradTest(){
        stu.averang();
        Assertions.assertEquals('C',stu.grad());
    }

    @Test
    public void highTest(){
        Assertions.assertEquals(80,stu.high());
    }

    @Test
    public void averangTest(){
        Assertions.assertEquals(70,stu.averang());
    }
}
