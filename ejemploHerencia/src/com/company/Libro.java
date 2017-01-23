package com.company;

public class Libro {

    private String titulo;
    private String ISBN;
    private boolean abierto = false;
    private int numPaginas;
    private int paginaActual = 0;

    public void abrir() {
        abierto = true;
    }

    public void cerrar() {
        abierto = false;

    }

    public Libro(String titulo, String ISBN, boolean abierto, int numPaginas, int paginaActual) {
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.abierto = abierto;
        this.numPaginas = numPaginas;
        this.paginaActual = paginaActual;
    }

    public Libro() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public boolean isAbierto() {
        return abierto;
    }


    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public void setPaginaActual(int paginaActual) {
        this.paginaActual = paginaActual;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", abierto=" + abierto +
                ", numPaginas=" + numPaginas +
                ", paginaActual=" + paginaActual +
                '}';
    }
}
