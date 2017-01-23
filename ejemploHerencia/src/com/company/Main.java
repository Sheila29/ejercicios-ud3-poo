package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Libro l = new Libro("Castle",
                "1234",
                false,
                1200,
                1);
        System.out.println(l);

        LibroInfantil li = new LibroInfantil();

        li.setTitulo("Charmed");

        System.out.println(li);

        System.out.print("Edad del niñ@: ");
        if (li.esRecomendable(Integer.parseInt(br.readLine()))) {
            System.out.println("Puede leerlo");
        } else {
            System.out.println("Elige otro libro");
        }


    }
}
