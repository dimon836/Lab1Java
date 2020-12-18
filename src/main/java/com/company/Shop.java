package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Shop implements ShowMethod {
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

    private List<Part> parts = new ArrayList<>();

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

    public List<Part> getParts() {
        return parts;
    }

    public Part getByIndexPart(int a) {
        try {
            int i = 0;
            for(Part o : this.getParts()) {
                if(i==a) {
                    return o;
                }
                i++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return null;
    }

    /*
    public List<Part> getSpecificPart(Predicate<? super Part> predicate) {
        ArrayList<Part> finalList = new ArrayList<>();
        for(Part o: this.getParts()) {
            if(predicate.test(o)) {
                finalList.add(o);
            }
        }
        return finalList;
    } */

    public double getAvgPartsPrice(){
        return parts
                .stream()
                .mapToDouble(Part::getPrice)
                .average()
                .orElse(0.0);
    }

//    public List<Part> getAllDepartments(){
//        return showAllParts(unit -> unit instanceof Part)
//                .stream()
//                .map(faculty -> new Part())
//                .map(Part::getName)
//                .flatMap(Collection::stream)
//                .collect(Collectors.toList());
//    }

    public String getMinName(double min) {
        for (int i = 0; i < this.getParts().size(); i++) {
            if (this.getByIndexPart(i).getPrice() == min) {
                return this.getByIndexPart(i).getName();
            }
        }
        throw new NullPointerException("Такого числа не существует!(min method)");
    }

    public String getMaxName(double max) {
        for (int i = 0; i < this.getParts().size(); i++) {
            if (this.getByIndexPart(i).getPrice() == max) {
                return this.getByIndexPart(i).getName();
            }
        }
        throw new NullPointerException("Такого числа не существует!(max method)");
    }

    public Map<String, List<Part>> getPrices(Predicate<? super Part> predicate){
        return parts.stream()
                .collect(Collectors.groupingBy(Part -> predicate.test(Part) ? "true" : "false"));
    }

    public void showIndexPart(int n) {
        try {
            int i = 0;
            for(Part o : this.getParts()) {
                if(i==n) {
                    o.showPart();
                }
                i++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public void showAllParts() {
        for(Part obj: this.getParts()) {
            obj.showPart();
        }
    }

    public void show() {
        System.out.print("Have we got parts for computer?");
        if(isParts_for_computer())
            System.out.println(" Yes.");
        else
            System.out.println(" No.");
    }
}
