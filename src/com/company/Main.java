package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Насчёт агрегации есть мысль, но она слишком глупая для её реализации :)

public class Main {
    static class Human {
        boolean collectComputer(boolean body, boolean inside_parts) {
            return body && inside_parts;
        }
    }

    public static void main(String []args) {
        InsideSystemBlock objI = new InsideSystemBlock();
        Body objB = new Body();
        objI.buyAllParts();
        objB.BuyBody();
        objI.show();
        objB.show();
        Human objH = new Human();
        if(objH.collectComputer(objI.isAllInsideParts(), objB.isBody_parts())) {
            System.out.println("Your computer has collected. Congrats!");
        }
        else {
            System.out.println("Your computer hasn't collected. Maybe you didn't buy some parts, or didn't have some " +
                    "instruments.");
        }
        System.out.println();
        objB.setInsideSystemBlock(objI);
        InsideSystemBlock objectI = objB.getInsideSystemBlock();
        if (objectI.isAllInsideParts())
            System.out.println("We have all parts inside.");
        else
            System.out.println("We haven't got all parts inside.");
        //И можно дальше проверку для каждого. if else...

        List<Integer> list = Prices.getPrices();
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}

enum Tools {
    SCREWDRIVER,
    BRADAWL,
    WRENCH
}

enum Prices {
    body_parts(100),
    CPU(101),
    motherboard(102),
    RAM(102),
    graphics_processor(104),
    storage_system(228),
    power_supply(119),
    system_cooling1(66),
    system_cooling2(66),
    gaming_peripherals(13),
    operating_system(499);

    private final int code;
    Prices(int code){
        this.code = code;
    }
    public int getCode(){ return code;}
    public static List<Integer> getPrices() {
        return Arrays.asList(body_parts.code, CPU.code, motherboard.code, RAM.code, graphics_processor.code,
                storage_system.code, power_supply.code, system_cooling1.code, system_cooling2.code,
                gaming_peripherals.code, operating_system.code);
    }

}

abstract class Shop {
    private boolean parts_for_computer;
    boolean body_parts;
    boolean CPU;
    boolean motherboard;
    boolean RAM;
    boolean graphics_processor;
    boolean storage_system;
    boolean power_supply;
    boolean system_cooling1, system_cooling2;
    boolean gaming_peripherals;
    boolean operating_system;

    Shop() {
        setParts_for_computer(true);
    }

    public void setParts_for_computer(boolean parts_for_computer) {
        this.parts_for_computer = parts_for_computer;
    }

    public boolean isParts_for_computer() {
        return parts_for_computer;
    }

    protected void show() {
        System.out.print("Have we got parts for computer?");
        if(isParts_for_computer())
            System.out.println(" Yes.");
        else
            System.out.println(" No.");
    }
}

class Body extends Shop {

    private InsideSystemBlock insideSystemBlock;

    Body() {
        body_parts = false;
    }
    void BuyBody() {
        setBody_parts(true);
    }

    public void setBody_parts(boolean body_parts) {
        this.body_parts = body_parts;
    }

    public boolean isBody_parts() {
        return body_parts;
    }

    /*
    * Композиция
    */
    // Объект, в каком находится информация о том, что уже находится внутри.
    public InsideSystemBlock getInsideSystemBlock() {
        return insideSystemBlock;
    }

    // Смена объекта(смена внутренних деталей)
    public void setInsideSystemBlock(InsideSystemBlock insideSystemBlock) {
        this.insideSystemBlock = insideSystemBlock;
    }

    @Override
    public void show() {
        System.out.print("Have we bought body parts?");
        if(isBody_parts())
            System.out.println(" Yes.");
        else
            System.out.println(" No.");
    }
}

class InsideSystemBlock extends Shop {
//    SystemBlock() {
//        CPU = false;
//        motherboard = false;
//        RAM = false;
//        graphics_processor = false;
//        storage_system = false;
//        power_supply = false;
//        system_cooling1 = false; system_cooling2 = false;
//        gaming_peripherals = false;
//        operating_system = false;
//    }

    private Body body;

    public void buyAllParts() {
        setCPU(true);
        setGaming_peripherals(true);
        setGraphics_processor(true);
        setMotherboard(true);
        setOperating_system(true);
        setPower_supply(true);
        setRAM(true);
        setStorage_system(true);
        setSystem_cooling1(true);
        setSystem_cooling2(true);
    }

    public boolean isAllInsideParts() {
        return isCPU() && isGaming_peripherals() && isMotherboard() && isRAM() &&
                isGraphics_processor() && isStorage_system() && isPower_supply() &&
                isSystem_cooling1() && isSystem_cooling2() && isOperating_system();
    }

    public void setCPU(boolean CPU) {
        this.CPU = CPU;
    }
    public void setMotherboard(boolean motherboard) {
        this.motherboard = motherboard;
    }
    public void setRAM(boolean RAM) {
        this.RAM = RAM;
    }
    public void setGraphics_processor(boolean graphics_processor) {
        this.graphics_processor = graphics_processor;
    }
    public void setStorage_system(boolean storage_system) {
        this.storage_system = storage_system;
    }
    public void setPower_supply(boolean power_supply) {
        this.power_supply = power_supply;
    }
    public void setSystem_cooling1(boolean system_cooling1) {
        this.system_cooling1 = system_cooling1;
    }
    public void setSystem_cooling2(boolean system_cooling2) {
        this.system_cooling2 = system_cooling2;
    }
    public void setGaming_peripherals(boolean gaming_peripherals) {
        this.gaming_peripherals = gaming_peripherals;
    }
    public void setOperating_system(boolean operating_system) {
        this.operating_system = operating_system;
    }

    /*
    * Композиция.
    */
    // Возвращает тело в каком находятся детали.
    public Body getBody () {
        return body;
    }

    //Меняет тело, в каком находятся детали.
    public void setBody (Body objB) {
        this.body = objB;
    }

    public boolean isCPU() {
        return CPU;
    }
    public boolean isMotherboard() {
        return motherboard;
    }
    public boolean isRAM() {
        return RAM;
    }
    public boolean isGraphics_processor() {
        return graphics_processor;
    }
    public boolean isStorage_system() {
        return storage_system;
    }
    public boolean isPower_supply() {
        return power_supply;
    }
    public boolean isSystem_cooling1() {
        return system_cooling1;
    }
    public boolean isSystem_cooling2() {
        return system_cooling2;
    }
    public boolean isGaming_peripherals() {
        return gaming_peripherals;
    }
    public boolean isOperating_system() {
        return operating_system;
    }

    @Override
    public void show() {
        System.out.print("Have we bought all other parts?");
        if( this.isAllInsideParts() )
            System.out.println(" Yes.");
        else
            System.out.println(" No.");
    }
}
