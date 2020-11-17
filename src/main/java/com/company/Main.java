package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    }
}
