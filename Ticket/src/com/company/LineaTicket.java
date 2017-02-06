package com.company;

/**
 * Created by 7FPROG10 on 06/02/2017.
 */
public class LineaTicket {

    private String producto;
    private double precioUnidad;
    private int numUnidades;

    public LineaTicket() {
    }


    public LineaTicket(String producto, double precioUnidad, int numUnidades) {
        this.producto = producto;
        this.precioUnidad = precioUnidad;
        this.numUnidades = numUnidades;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecioUnidad(String s) {
        return precioUnidad;
    }

    public void setPrecioUnidad(double precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

    public int getNumUnidades() {
        return numUnidades;
    }

    public void setNumUnidades(String numUnidades) {
        this.numUnidades = numUnidades;
    }

    @Override
    public String toString() {
        return "LineaTicket{" +
                "producto='" + producto + '\'' +
                ", precioUnidad=" + precioUnidad +
                ", numUnidades=" + numUnidades +
                '}';
    }

    public int recuentoLineas(tickets.){
        int total = 0;

        return total;
    }
}
