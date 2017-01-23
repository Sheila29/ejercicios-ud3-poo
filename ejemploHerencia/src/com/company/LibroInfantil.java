package com.company;


public class LibroInfantil extends Libro {

    private int edadRecomendada = 18;


    public boolean esRecomendable(int edadNinyo) {
        return edadNinyo >= edadRecomendada;
    }

    @Override
    public String toString() {
        return "LibroInfantil{" +
                "edadRecomendada=" + edadRecomendada +
                '}';
    }
}
