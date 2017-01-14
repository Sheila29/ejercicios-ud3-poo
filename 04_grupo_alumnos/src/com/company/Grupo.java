package com.company;


public class Grupo {

    private String codigo;

    private Alumno[] alumnos = new Alumno[5];

    public Grupo() {

        for (int i = 0; i < 5; i++) {
            alumnos[i] = new Alumno();

        }
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }
}
