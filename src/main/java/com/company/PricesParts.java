package com.company;

public class PricesParts {
    float body_parts;
    float CPU;
    float motherboard;

    public PricesParts(int body_parts, int CPU, int motherboard) {
        this.body_parts = body_parts;
        this.CPU = CPU;
        this.motherboard = motherboard;
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
        return getPriceBody_parts() + getPriceCPU() + getPriceMotherboard();
    }

    public float getAverage() {
        return (getPriceBody_parts() + getPriceCPU() + getPriceMotherboard())/3;
    }

}
