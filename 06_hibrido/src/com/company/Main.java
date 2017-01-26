package com.company;

public class Main {

    public static void main(String[] args) {

     MotorCombustionInterna mci = new MotorCombustionInterna();

        mci.arrancar();
        mci.parar();


        MotorElectrico me = new MotorElectrico();

        me.arrancar();
        me.parar();
    }
}
