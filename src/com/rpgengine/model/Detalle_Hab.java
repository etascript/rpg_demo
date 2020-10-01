package com.rpgengine.model;

public class Detalle_Hab extends Habilidad{
    private int up_atk_f, up_atk_s, up_def_f, up_def_s, damage;
    private boolean activa;

    public Detalle_Hab(String nombre_hab, int runas, int up_atk_f, int up_atk_s, int up_def_f, int up_def_s, int damage, boolean activa) {
        super(nombre_hab, runas);
        this.up_atk_f = up_atk_f;
        this.up_atk_s = up_atk_s;
        this.up_def_f = up_def_f;
        this.up_def_s = up_def_s;
        this.damage = damage;
        this.activa = activa;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

}
