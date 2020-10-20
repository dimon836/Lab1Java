package com.company;

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