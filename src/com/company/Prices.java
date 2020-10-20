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
