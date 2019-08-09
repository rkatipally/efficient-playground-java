package org.raj.misc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Matchers.any;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mockito;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PersonTest{

    @Test
    public void playTest() {
        Person person = new Person("name", 15);

        Person person1 = Mockito.spy(person);

        Mockito.doReturn(true).when(person1).runInGround(any());

        assertEquals(true, person1.isPlay());
    }
}