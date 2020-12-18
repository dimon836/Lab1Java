package com.company;

import java.util.*;
import java.util.stream.DoubleStream;

public class Main {
    static class Human {
        public Human() {
            super();
        }

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
        InsideSystemBlock objectI = objB.isInsideSystemBlock();
        if (objectI.isAllInsideParts())
            System.out.println("We have all parts inside.");
        else
            System.out.println("We haven't got all parts inside.");
        //И можно дальше проверку для каждого. if else...

        List<Integer> list = Prices.getPrices();
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //9
        StringBuilder allTools = new StringBuilder("Tools: ");
        allTools.append(Tools.SCREWDRIVER).append("; ").append(Tools.BRADAWL).append("; ")
                                                                                .append(Tools.WRENCH).append("; ");
        System.out.println(allTools);
        //10
        String allToolsString = allTools.delete(0, "Tools: ".length()).toString();
        String[] splitTools = allToolsString.split("; ");
        System.out.println(Arrays.toString(splitTools));
        //11
        System.out.println(allToolsString + 3);
        System.out.println(allToolsString + Boolean.TRUE);
        System.out.println(allToolsString + "three");
        System.out.println(allToolsString + allTools);
        System.out.println(allToolsString + Arrays.asList(1, 2, 3));

        newMain();

    }

    public static void newMain() {
        //repair some logic of code
        Part body_parts = new Part("Parts of body", 200,1);
        Part CPU = new Part("CPU", 215, 1);
        Part motherboard = new Part("motherboard", 85, 1);
        Part RAM = new Part("RAM", 99, 1);
        Part graphics_processor = new Part("graphics_processor", 116, 1);
        Part storage_system = new Part("storage_system", 17, 1);
        Part power_supply = new Part("power_supply", 96, 1);
        Part system_cooling1 = new Part("system_cooling1", 14, 1);
        Part system_cooling2 = new Part("system_cooling2", 14, 1);
        Part gaming_peripherals = new Part("gaming_peripherals", 399, 1);
        Part operating_system = new Part("operating_system", 256, 1);

        Shop objectShop = new Shop();

        objectShop.getParts().add(body_parts);
        objectShop.getParts().add(CPU);
        objectShop.getParts().add(motherboard);
        objectShop.getParts().add(RAM);
        objectShop.getParts().add(graphics_processor);
        objectShop.getParts().add(storage_system);
        objectShop.getParts().add(power_supply);
        objectShop.getParts().add(system_cooling1);
        objectShop.getParts().add(system_cooling2);
        objectShop.getParts().add(gaming_peripherals);
        objectShop.getParts().add(operating_system);

        System.out.println(objectShop.getParts().size());

        //Show all parts information
        System.out.println("Show parts info:");
        objectShop.showAllParts();

        //Average by method(ez)
        System.out.println("Average: " + objectShop.getAvgPartsPrice());

        double[] pricesOfParts = objectShop.getParts().stream().mapToDouble(Part::getPrice).toArray();

        DoubleSummaryStatistics doubleSummaryStatistics = DoubleStream.of(pricesOfParts).summaryStatistics();

        //Same average by lib DoubleSummaryStatistics
        System.out.println("Same average: " + doubleSummaryStatistics.getAverage() + "by DoubleSummaryStatistics");
        //Max
        System.out.println("The most expensive part: " + objectShop.getMaxName(doubleSummaryStatistics.getMax()) + ' ' +
                doubleSummaryStatistics.getMax());
        //By selection condition
        System.out.println("Map with prices parts");
        System.out.println(objectShop.getPrices(Part -> Part.getPrice() >= 100));
        //Min
        System.out.println("The cheapest part: " + objectShop.getMinName(doubleSummaryStatistics.getMin()) + ' ' +
                doubleSummaryStatistics.getMin());
        //Sum of all parts
        System.out.println("Sum of all parts: " + doubleSummaryStatistics.getSum());

    }
}
