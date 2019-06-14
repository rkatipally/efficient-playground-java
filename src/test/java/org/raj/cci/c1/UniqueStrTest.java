package org.raj.cci.c1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UniqueStrTest {

    private UniqueStr uniqueStr;

    @BeforeAll
    public void setUp(){
        this.uniqueStr = new UniqueStr();

    }

    @ParameterizedTest
    @ValueSource(strings = {"abc", "3fd5ui", "0olmjh", "1wqerdfhju"})
    void isUnique1(String str) {
        assertTrue(this.uniqueStr.isUnique(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"abca", "3ffd5ui", "0holmjh", "1uwqerdfhju"})
    void isUnique2(String str) {
        assertFalse(this.uniqueStr.isUnique(str));
    }
}
