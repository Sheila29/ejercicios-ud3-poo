package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Grupo g = new Grupo();

        System.out.println("Código de grupo: ");
        g.setCodigo(br.readLine());

        for (int i = 0; i < 5; i++) {

            System.out.println("Nombre: ");
            g.getAlumnos()[i].setNombre(br.readLine());

            System.out.println("Apellidos: ");
            g.getAlumnos()[i].setApellidos(br.readLine());

            System.out.println("DNI: ");
            g.getAlumnos()[i].setDNI(br.readLine());

            System.out.println("Teléfono: ");
            g.getAlumnos()[i].setTelefono(br.readLine());

        }

        for (int i = 0; i < 5; i++) {

            System.out.println("Nombre: "+g.getAlumnos()[i].getNombre());
            System.out.println("Apellidos: "+g.getAlumnos()[i].getApellidos());
            System.out.println("DNI: "+g.getAlumnos()[i].getDNI());
            System.out.println("Teléfono: "+g.getAlumnos()[i].getTelefono());

        }
    }
}
