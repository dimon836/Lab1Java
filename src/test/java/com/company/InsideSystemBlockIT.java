package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InsideSystemBlockIT {
    @Test
    void buyAllParts_BuyIternalComputerParts_True() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.buyAllParts();
        Assertions.assertTrue(obj.isAllInsideParts());
    }

    @Test
    void isAllInsideParts_CreateObjectAndCheckMethod_False() {
        InsideSystemBlock obj = new InsideSystemBlock();
        Assertions.assertFalse(obj.isAllInsideParts());
    }

    @Test
    void isCPU_SetSome_TrueOrFalse() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setCPU(true);
        Assertions.assertTrue(obj.isCPU());
        obj.setCPU(false);
        Assertions.assertFalse(obj.isCPU());
    }

    @Test
    void isMotherboard_SetSome_TrueOrFalse() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setMotherboard(true);
        Assertions.assertTrue(obj.isMotherboard());
        obj.setMotherboard(false);
        Assertions.assertFalse(obj.isMotherboard());
    }

    @Test
    void isRAM_SetSome_TrueOrFalse() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setRAM(true);
        Assertions.assertTrue(obj.isRAM());
        obj.setRAM(false);
        Assertions.assertFalse(obj.isRAM());
    }

    @Test
    void isGraphics_processor_SetSome_TrueOrFalse() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setGraphics_processor(true);
        Assertions.assertTrue(obj.isGraphics_processor());
        obj.setGraphics_processor(false);
        Assertions.assertFalse(obj.isGraphics_processor());
    }

    @Test
    void isStorage_system_SetSome_TrueOrFalse() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setStorage_system(true);
        Assertions.assertTrue(obj.isStorage_system());
        obj.setStorage_system(false);
        Assertions.assertFalse(obj.isStorage_system());
    }

    @Test
    void isPower_supply_SetSome_TrueOrFalse() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setPower_supply(true);
        Assertions.assertTrue(obj.isPower_supply());
        obj.setPower_supply(false);
        Assertions.assertFalse(obj.isPower_supply());
    }

    @Test
    void isSystem_cooling1_SetSome_TrueOrFalse() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setSystem_cooling1(true);
        Assertions.assertTrue(obj.isSystem_cooling1());
        obj.setSystem_cooling1(false);
        Assertions.assertFalse(obj.isSystem_cooling1());
    }

    @Test
    void isSystem_cooling2_SetSome_TrueOrFalse() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setSystem_cooling2(true);
        Assertions.assertTrue(obj.isSystem_cooling2());
        obj.setSystem_cooling2(false);
        Assertions.assertFalse(obj.isSystem_cooling2());
    }

    @Test
    void isGaming_peripherals_SetSome_TrueOrFalse() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setGaming_peripherals(true);
        Assertions.assertTrue(obj.isGaming_peripherals());
        obj.setGaming_peripherals(false);
        Assertions.assertFalse(obj.isGaming_peripherals());
    }

    @Test
    void isOperating_system_SetSome_TrueOrFalse() {
        InsideSystemBlock obj = new InsideSystemBlock();
        obj.setOperating_system(true);
        Assertions.assertTrue(obj.isOperating_system());
        obj.setOperating_system(false);
        Assertions.assertFalse(obj.isOperating_system());
    }

    @Test
    void setBody_TestCompose_EqualsObjects() {
        InsideSystemBlock obj = new InsideSystemBlock();
        Body objB = new Body();
        obj.setBody(objB);
        Assertions.assertEquals(objB, obj.getBody());
    }
}
