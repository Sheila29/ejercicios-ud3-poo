package com.company;


public class Puerta {

    private boolean elevalunasElectrico;

    private Coche coche = null;

    public Puerta(boolean elevalunasElectrico) {
        this.setElevalunasElectrico(elevalunasElectrico);
    }

    public boolean isElevalunasElectrico() {
        return elevalunasElectrico;
    }

    public void setElevalunasElectrico(boolean elevalunasElectrico) {
        this.elevalunasElectrico = elevalunasElectrico;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    @Override
    public String toString() {
        return "Puerta{" +
                "elevalunasElectrico=" + elevalunasElectrico +
                '}';
    }
}

