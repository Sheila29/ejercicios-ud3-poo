package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("COCHE");
        System.out.println("------------");

        System.out.println("Marca: ");
        String marca = br.readLine();

        System.out.println("Modelo: ");
        String modelo = br.readLine();

        System.out.println("Color: ");
        int color = Integer.parseInt(br.readLine());

        Coche c = new Coche(marca,modelo,color);


        System.out.println("MOTOR");
        System.out.println("------------");
        System.out.println("Cilindrada: ");
        int cilindrada = Integer.parseInt(br.readLine());

        System.out.println("Combustible: ");
        String combustible = br.readLine();


        System.out.println("Potencia: ");
        int potencia = Integer.parseInt(br.readLine());

        Motor m = new Motor(cilindrada,combustible,potencia);

        c.addMotor(m);


        System.out.println("RUEDA");
        System.out.println("------------");
        Rueda r = new Rueda("320");

        System.out.println("PUERTA");
        System.out.println("------------");

        boolean añadirMas;
        int recuento = 0;
        do{
            System.out.println("¿elevalunas eléctrico s/n?:");
            boolean elevalunas = br.readLine().equalsIgnoreCase("S");// DEVUELVE TRUE

            Puerta p = new Puerta(elevalunas);

            c.addPuerta(p);



            System.out.println("¿Quieres añadir más puertas s/n?:");
            añadirMas = br.readLine().equalsIgnoreCase("S");
            recuento++;





        }while((añadirMas  && recuento < 5) || (recuento < 2));












    }
}
