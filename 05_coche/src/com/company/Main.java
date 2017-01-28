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
<<<<<<< Updated upstream

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




=======

        System.out.print("  Marca: ");
        String marca = br.readLine();

        System.out.print("  Modelo: ");
        String modelo = br.readLine();

        System.out.print("  Color: ");
        int color = Integer.parseInt(br.readLine());

        Coche c = new Coche(marca, modelo, color);

        System.out.println("MOTOR");
        System.out.println("-----------");

        System.out.print("  Cilindrada: ");
        int cilindrada = Integer.parseInt(br.readLine());

        System.out.print("  Combustible: ");
        String combustible = br.readLine();

        System.out.print("  Potencia: ");
        int potencia = Integer.parseInt(br.readLine());
>>>>>>> Stashed changes

        Motor m = new Motor(cilindrada, combustible, potencia);

        c.addMotor(m);

        System.out.println("RUEDAS");
        System.out.println("----------");

        System.out.print("  Diámetro: ");
        String diametro = br.readLine();

        for (int i = 0; i < 4; i++) {
            c.addRueda(new Rueda(diametro));
        }

        System.out.println("PUERTAS");

        int n = 0;

        boolean añadirMas = false;
        do {
            System.out.print("  ¿Elevalunas eléctricos? (s/n): ");
            boolean tieneElevalunas = br.readLine().equalsIgnoreCase("S");

            Puerta p = new Puerta(tieneElevalunas);

            c.addPuerta(p);

            n += 1;

            if (n >= 2 && n < 5) {
                System.out.print("  ¿Quieres añadir más puertas? (s/n): ");
                añadirMas = br.readLine().equalsIgnoreCase("S");
            }

        } while ((añadirMas && n < 5) || (n < 2));

        System.out.println("ESTE ES TU COCHE");
        System.out.println(c);

    }









}
