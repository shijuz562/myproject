package com.tom;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void bmiTest(){
        Person person = new Person();
        person.height = 1.7f;
        person.weight = 66.5f;
        Assertions.assertEquals(66.5f/(1.7f*1.7f), person.bmi());
    }
}
