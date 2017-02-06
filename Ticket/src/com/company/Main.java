package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<LineaTicket> tickets = new LinkedList<>();

        Ticket t = new Ticket();

        LineaTicket lt = new LineaTicket();



        char respuesta = ' ';
        do {
            System.out.println("Producto:");
            lt.setProducto(br.readLine());


            System.out.println("Precio unidad: ");
            lt.getPrecioUnidad(br.readLine());


            System.out.println("Número de unidades: ");
            lt.setNumUnidades(br.readLine());




            System.out.println("¿quieres continuar?: ");
            respuesta = br.readLine().charAt(0);

        }while ( respuesta != 's');

        for (int i = 0; i < tickets.size(); i++) {


        }



    }
}
