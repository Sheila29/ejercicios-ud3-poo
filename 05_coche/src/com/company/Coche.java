package com.company;

public class Coche {

    private String marca;
    private String modelo;
    private int color;

    private Motor[] motores = new Motor[10];
    private int numMotores = 0;
    private Puerta[] puertas = new Puerta[5];
    private int numPuertas = 0;
    private Rueda[] ruedas = new Rueda[4];
    private int numRuedas = 0;

    public void addMotor(Motor m){
        motores[numMotores] = m ;
        numMotores++;
    }

    public void addPuerta(Puerta p){
        puertas[numPuertas] = p;
        numPuertas++;
    }

    public void addRueda(Rueda r){
        ruedas[numRuedas] = r;
        numRuedas++;
    }

    public Coche() {

        getMotores()[0] = new Motor();

        for (int i = 0; i < 4; i++) {
            getRuedas()[i] = new Rueda();
        }

        for (int i = 0; i < 2; i++) {
            getPuertas()[i] = new Puerta();

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

    public Motor[] getMotores() {
        return motores;
    }

    public void setMotores(Motor[] motores) {
        this.motores = motores;
    }

    public Puerta[] getPuertas() {
        return puertas;
    }

    public void setPuertas(Puerta[] puertas) {
        this.puertas = puertas;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }
}
