package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsideSystemBlockTest {

    @Test
    void buyAllParts() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.buyAllParts();
        assertTrue(obj.isAllInsideParts());
    }

    @Test
    void isAllInsideParts() {
        InsideSystemBlock obj = new InsideSystemBlock();
        assertFalse(obj.isAllInsideParts());
    }

    @Test
    void isCPU() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setCPU(true);
        assertTrue(obj.isCPU());
        obj.setCPU(false);
        assertFalse(obj.isCPU());
    }

    @Test
    void isMotherboard() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setMotherboard(true);
        assertTrue(obj.isMotherboard());
        obj.setMotherboard(false);
        assertFalse(obj.isMotherboard());
    }

    @Test
    void isRAM() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setRAM(true);
        assertTrue(obj.isRAM());
        obj.setRAM(false);
        assertFalse(obj.isRAM());
    }

    @Test
    void isGraphics_processor() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setGraphics_processor(true);
        assertTrue(obj.isGraphics_processor());
        obj.setGraphics_processor(false);
        assertFalse(obj.isGraphics_processor());
    }

    @Test
    void isStorage_system() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setStorage_system(true);
        assertTrue(obj.isStorage_system());
        obj.setStorage_system(false);
        assertFalse(obj.isStorage_system());
    }

    @Test
    void isPower_supply() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setPower_supply(true);
        assertTrue(obj.isPower_supply());
        obj.setPower_supply(false);
        assertFalse(obj.isPower_supply());
    }

    @Test
    void isSystem_cooling1() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setSystem_cooling1(true);
        assertTrue(obj.isSystem_cooling1());
        obj.setSystem_cooling1(false);
        assertFalse(obj.isSystem_cooling1());
    }

    @Test
    void isSystem_cooling2() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setSystem_cooling2(true);
        assertTrue(obj.isSystem_cooling2());
        obj.setSystem_cooling2(false);
        assertFalse(obj.isSystem_cooling2());
    }

    @Test
    void isGaming_peripherals() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setGaming_peripherals(true);
        assertTrue(obj.isGaming_peripherals());
        obj.setGaming_peripherals(false);
        assertFalse(obj.isGaming_peripherals());
    }

    @Test
    void isOperating_system() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setOperating_system(true);
        assertTrue(obj.isOperating_system());
        obj.setOperating_system(false);
        assertFalse(obj.isOperating_system());
    }

//    @Test
//    void getBody() {
//        InsideSystemBlock obj = new InsideSystemBlock();
//        Body objB = new Body();
//        obj.setBody(objB);
//        assertEquals(objB, obj.getBody());
//    }

    @Test
    void setBody() {
        InsideSystemBlock obj = new InsideSystemBlock();
        Body objB = new Body();
        obj.setBody(objB);
        assertEquals(objB, obj.getBody());
    }

}