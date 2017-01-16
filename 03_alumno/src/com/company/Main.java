package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Alumno[] alumnos = new Alumno[2];

        for (int i = 0; i < alumnos.length; i++) {

            alumnos[i] = new Alumno();

            System.out.print("Nombre: ");
            alumnos[i].setNombre(br.readLine());

            System.out.print("Apellidos: ");
            alumnos[i].setApellidos(br.readLine());

            System.out.print("DNI: ");
            alumnos[i].setDNI(br.readLine());

            System.out.print("Teléfono: ");
            alumnos[i].setTelefono(br.readLine());


        }

        for (int i = 0; i < alumnos.length; i++) {

            System.out.println(alumnos[i].toString());

        }

    }

}