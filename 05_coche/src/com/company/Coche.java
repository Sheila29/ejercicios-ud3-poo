package com.company;

public class Coche {

    private String marca;
    private String modelo;
    private int color;

    private Motor[] motores = new Motor[10];
    private Puerta[] puertas = new Puerta[5];
    private Rueda[] ruedas = new Rueda[4];

    public Coche(){

        motores [0] = new Motor();

        for (int i = 0; i < 4; i++) {
            ruedas[i] = new Rueda();
        }

        for (int i = 0; i < 2; i++) {
            puertas[i] = new Puerta();

        }
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
