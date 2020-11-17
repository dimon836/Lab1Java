package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyTest {

    @Test
    void buyBody() {
        Body obj = new Body();
        obj.BuyBody();
        assertTrue(obj.isBody_parts());
    }

    @Test
    void isBody_parts() {
        Body obj = new Body();
        obj.setBody_parts(true);
        assertTrue(obj.isBody_parts());
        obj.setBody_parts(false);
        assertFalse(obj.isBody_parts());
    }

    @Test
    void isInsideSystemBlock() {
        Body obj = new Body();
        InsideSystemBlock objI = new InsideSystemBlock();
        obj.setInsideSystemBlock(objI);
        assertEquals(obj.isInsideSystemBlock(), objI);
    }
}