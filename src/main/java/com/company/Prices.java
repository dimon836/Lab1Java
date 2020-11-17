package com.company;

import java.util.Arrays;
import java.util.List;

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

    private final int price;
    Prices(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public static List<Integer> getPrices() {
        return Arrays.asList(body_parts.price, CPU.price, motherboard.price, RAM.price, graphics_processor.price,
                storage_system.price, power_supply.price, system_cooling1.price, system_cooling2.price,
                gaming_peripherals.price, operating_system.price);
    }
}
