package com.company;


public class MotorElectrico extends Motor {

    private String tipoBateria;


    public MotorElectrico() {
    }

    public MotorElectrico(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    @Override
    public String toString() {
        return "MotorElectrico{" +
                "tipoBateria='" + tipoBateria + '\'' +
                '}';
    }
}
