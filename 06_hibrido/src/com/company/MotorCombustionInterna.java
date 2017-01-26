package com.company;


public class MotorCombustionInterna extends Motor {

    private int cilindrada;
    private String combustible;

    public MotorCombustionInterna() {
    }

    public MotorCombustionInterna(int cilindrada, String combustible) {
        this.cilindrada = cilindrada;
        this.combustible = combustible;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return "MotorCombustionInterna{" +
                "cilindrada=" + cilindrada +
                ", combustible='" + combustible + '\'' +
                '}';
    }
}
