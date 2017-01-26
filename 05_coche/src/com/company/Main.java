package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bienvenido a la página de diseño de su futuro coche, por favor,diseñe su coche");

        Coche c = new Coche();
        System.out.println("Marca");
        c.setMarca("Opel");
        System.out.println("Modelo");
        c.setModelo("Corsa");
        System.out.println("Color");
        c.setColor(64);

        c.setMarca(br.readLine());

        Motor m = new Motor();

        System.out.println("Gracias ha pinchado en la sección del motor: ");
        System.out.println("Cilindrada");
        m.setCilindrada(200);
        System.out.println("Combustible");
        m.setCombustible("Gasolina");
        System.out.println("Potencia");
        m.setPotencia(200);

        Rueda r = new Rueda();

        System.out.println("Gracias ha pinchado en la sección de rueda: ");
        System.out.println("Diametro");
        r.setDiametro("320");

        Puerta p = new Puerta();

        System.out.println("Gracias ha pinchado en la sección de puerta: ");
        System.out.println("Elevalunas electrico s/n");
        p.setElevalunasElectrico(true);








    }
}
