package com.rpgengine.model;

public class Clase extends Personaje{

    private String nombre_clase;
    private int up_atk_f, up_atk_s, up_def_f, up_def_s, dw_atk_f, dw_atk_s, dw_def_f, dw_def_s;

    public Clase(String nombre, String clase, int vida, int atk_f, int atk_s, int def_f, int def_s, int crit, int luck, String nombre_clase, int up_atk_f, int up_atk_s, int up_def_f, int up_def_s, int dw_atk_f, int dw_atk_s, int dw_def_f, int dw_def_s) {
        super(nombre, clase, vida, atk_f, atk_s, def_f, def_s, crit, luck);
        this.nombre_clase = nombre_clase;
        this.up_atk_f = up_atk_f;
        this.up_atk_s = up_atk_s;
        this.up_def_f = up_def_f;
        this.up_def_s = up_def_s;
        this.dw_atk_f = dw_atk_f;
        this.dw_atk_s = dw_atk_s;
        this.dw_def_f = dw_def_f;
        this.dw_def_s = dw_def_s;
    }

    public String getNombre_clase() {
        return nombre_clase;
    }

    public void setNombre_clase(String nombre_clase) {
        this.nombre_clase = nombre_clase;
    }

    public int getUp_atk_f() {
        return up_atk_f;
    }

    public void setUp_atk_f(int up_atk_f) {
        this.up_atk_f = up_atk_f;
    }

    public int getUp_atk_s() {
        return up_atk_s;
    }

    public void setUp_atk_s(int up_atk_s) {
        this.up_atk_s = up_atk_s;
    }

    public int getUp_def_f() {
        return up_def_f;
    }

    public void setUp_def_f(int up_def_f) {
        this.up_def_f = up_def_f;
    }

    public int getUp_def_s() {
        return up_def_s;
    }

    public void setUp_def_s(int up_def_s) {
        this.up_def_s = up_def_s;
    }

    public int getDw_atk_f() {
        return dw_atk_f;
    }

    public void setDw_atk_f(int dw_atk_f) {
        this.dw_atk_f = dw_atk_f;
    }

    public int getDw_atk_s() {
        return dw_atk_s;
    }

    public void setDw_atk_s(int dw_atk_s) {
        this.dw_atk_s = dw_atk_s;
    }

    public int getDw_def_f() {
        return dw_def_f;
    }

    public void setDw_def_f(int dw_def_f) {
        this.dw_def_f = dw_def_f;
    }

    public int getDw_def_s() {
        return dw_def_s;
    }

    public void setDw_def_s(int dw_def_s) {
        this.dw_def_s = dw_def_s;
    }
}
