package com.company;


public class PricesParts {
    private float body_parts;
    private float CPU;
    private float motherboard;
    private float power_supply;

    public PricesParts(float body_parts, float CPU, float motherboard, float power_supply) {
        this.body_parts = body_parts;
        this.CPU = CPU;
        this.motherboard = motherboard;
        this.power_supply = power_supply;
    }

    public void setPower_supply(float power_supply) {
        this.power_supply = power_supply;
    }

    public float getPower_supply() {
        return power_supply;
    }

    public void setBody_parts(float body_parts) {
        this.body_parts = body_parts;
    }

    public void setCPU(float CPU) {
        this.CPU = CPU;
    }

    public void setMotherboard(float motherboard) {
        this.motherboard = motherboard;
    }

    public float getPriceBody_parts() {
        return body_parts;
    }

    public float getPriceCPU() {
        return CPU;
    }

    public float getPriceMotherboard() {
        return motherboard;
    }

    public float getPriceSum() {
        Operationable<Float> operation;
        operation = (x,y,z, t)-> (int) (x + y + z + t);
        return operation.calculate(getPriceBody_parts(), getPriceCPU(), getPriceMotherboard(), getPower_supply());
    }

    public float getAverage() {
        return (getPriceBody_parts() + getPriceCPU() + getPriceMotherboard() + getPower_supply())/4;
    }

}
