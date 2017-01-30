package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {


    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Equipo> equipos = new ArrayList<>();

        int opcion = 0;
        do {

            System.out.println("       MENÚ     ");
            System.out.println("----------------");
            System.out.println("1.Nuevo equipo:");
            System.out.println("2.Nuevo jugador(en equipo existente): ");
            System.out.println("3.Ver equipos (y jugadores): ");
            System.out.println("4.Salir");

            System.out.println("Opción: ");
            opcion = Integer.parseInt(br.readLine());


            switch(opcion){
                case 1:
                //  Nuevo equipo
                Equipo e = new Equipo("Dallas Cowboys", "2005");


                    break;
                case 2:
                    // Nuevo jugador ( en equipo existente )
                    Jugador j = new Jugador("Dark Prescott", 200);
                    e.getJugadores().add(j);


                    break;
                case 3:
                    // Ver equipos y jugadores
                    for (int i = 0; i < equipos.size(); i++) {
                        System.out.println("Equipos: "+equipos.get(i));
                        System.out.println("Jugadores: "+e.getJugadores(i).get(i));
                    }
                    break;
                case 4:
                    System.out.println("Agur");



            }
        }while( opcion != 4);
    }
}
