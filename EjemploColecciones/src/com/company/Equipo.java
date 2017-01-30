package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 7FPROG10 on 30/01/2017.
 */
public class Equipo {

    private String nombre;
    private String fechaCreacion;

    private List<Jugador> jugadores = new ArrayList<>();

    public Equipo() {

    }


    public Equipo(String nombre, String fechaCreacion) {
        this.setNombre(nombre);
        this.setFechaCreacion(fechaCreacion);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                '}';
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
