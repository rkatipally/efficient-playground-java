package org.raj.cci.c1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UniqueStrTest {

    private UniqueStr uniqueStr;

    @BeforeAll
    public void setUp(){
        this.uniqueStr = new UniqueStr();

    }

    @Test
    void isUnique() {
        assertTrue(this.uniqueStr.isUnique("ABC"));
    }
}
