package com.company;


public class Cronometro {

    private long horaInicio = System.nanoTime();

    public void tiempoTranscurrido() {

        long intervalo = System.nanoTime() - horaInicio;

    }

}
