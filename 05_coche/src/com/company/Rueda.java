package com.company;


public class Rueda {

    private String diametro;

    private Coche coche = null;

    public Rueda(String diametro) {
        this.diametro = diametro;
    }

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }

<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }
<<<<<<< Updated upstream

    @Override
    public String toString() {
        return "Rueda{" +
                "diametro='" + diametro + '\'' +
                '}';
    }
=======
>>>>>>> Stashed changes
}
