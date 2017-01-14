package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion = 0;

        Cronometro[] cs = new Cronometro[10];
        int numCronometros = 0;

        do {
            System.out.println("Menú: ");
            System.out.println("1.Nuevo cronómetro");
            System.out.println("2.Consultar cronómetro");
            System.out.println("3.Salir");

            System.out.print("Opción: ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    if (numCronometros < 10) {
                        cs[numCronometros] = new Cronometro();
                        numCronometros++;
                    }
                    break;
                case 2:
                    for (int i = 0; i < numCronometros; i++) {
                        cs[i].tiempoTranscurrido();

                    }
                    break;

            }
        } while (opcion != 3);


    }
    }

