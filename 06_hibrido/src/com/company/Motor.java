package com.company;


public abstract class Motor {

    protected int potencia;
    protected boolean encendido;

    public void arrancar(){
        encendido = true;
    }



    public void parar(){
        encendido = false;

    }





}
