package com.rpgengine.model;

public class Habilidad {
    private String nombre_hab;
    private int runas;

    public Habilidad(String nombre_hab, int runas) {
        this.nombre_hab = nombre_hab;
        this.runas = runas;
    }

    public String getNombre_hab() {
        return nombre_hab;
    }

    public void setNombre_hab(String nombre_hab) {
        this.nombre_hab = nombre_hab;
    }

    public int getRunas() {
        return runas;
    }

    public void setRunas(int runas) {
        this.runas = runas;
    }
}
