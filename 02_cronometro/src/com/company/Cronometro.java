package com.company;


public class Cronometro {

    private long horaInicio = System.nanoTime();

    public void tiempoTranscurrido() {

        double intervalo = (System.nanoTime() - horaInicio) /1000000000.0;

        System.out.println(intervalo);

    }



}
