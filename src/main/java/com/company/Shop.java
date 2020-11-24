package com.company;

class Shop implements ShowMethod {
    private PricesParts pricesParts;

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

    public float getAverage(PricesParts pricesParts, float a, float b, float c) {
        pricesParts.setBody_parts(a);
        pricesParts.setCPU(b);
        pricesParts.setMotherboard(c);
        return pricesParts.getAverage();
    }

    public void show() {
        System.out.print("Have we got parts for computer?");
        if(isParts_for_computer())
            System.out.println(" Yes.");
        else
            System.out.println(" No.");
    }
}
