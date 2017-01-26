package com.company;

public class Main {

    public static void main(String[] args) {

        Motor mci = new MotorCombustionInterna();

        mci.arrancar();
        mci.parar();


        Motor me = new MotorElectrico();

        me.arrancar();
        me.parar();


    }
}
