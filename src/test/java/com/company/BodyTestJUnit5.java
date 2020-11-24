package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BodyTest {

    @Test
    void buyBody_buyPartsForBody_True() {
        Body obj = new Body();
        obj.BuyBody();
        assertTrue(obj.isBody_parts());
    }

    @Test
    void isBodyParts_SetSome_TrueOrFalse() {
        Body obj = new Body();
        obj.setBody_parts(true);
        assertTrue(obj.isBody_parts());
        obj.setBody_parts(false);
        assertFalse(obj.isBody_parts());
    }

    @Test
    void isInsideSystemBlock_TestCompose_EqualsObjects() {
        Body obj = new Body();
        InsideSystemBlock objI = new InsideSystemBlock();
        obj.setInsideSystemBlock(objI);
        assertEquals(obj.isInsideSystemBlock(), objI);
    }
}