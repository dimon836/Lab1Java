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
