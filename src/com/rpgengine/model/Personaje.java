package com.rpgengine.model;

import com.rpgengine.model.Clase;
import com.rpgengine.model.Habilidad;
import com.rpgengine.model.Detalle_Hab;

public class Personaje {
    private String nombre;
    private Clase clase;
    private int vida, atk_f, atk_s, def_f, def_s, crit, luck;
    private Detalle_Hab det_hab[] = new Detalle_Hab[2];

    public Personaje(String nombre, Clase clase, int vida, int atk_f, int atk_s, int def_f, int def_s, int crit, int luck, Detalle_Hab[] det_hab) {
        this.nombre = nombre;
        this.clase = clase;
        this.vida = vida;
        this.atk_f = atk_f;
        this.atk_s = atk_s;
        this.def_f = def_f;
        this.def_s = def_s;
        this.crit = crit;
        this.luck = luck;
        this.det_hab = det_hab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtk_f() {
        return atk_f;
    }

    public void setAtk_f(int atk_f) {
        this.atk_f = atk_f;
    }

    public int getAtk_s() {
        return atk_s;
    }

    public void setAtk_s(int atk_s) {
        this.atk_s = atk_s;
    }

    public int getDef_f() {
        return def_f;
    }

    public void setDef_f(int def_f) {
        this.def_f = def_f;
    }

    public int getDef_s() {
        return def_s;
    }

    public void setDef_s(int def_s) {
        this.def_s = def_s;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public Detalle_Hab[] getDet_hab() {
        return det_hab;
    }

    public void setDet_hab(Detalle_Hab[] det_hab) {
        this.det_hab = det_hab;
    }

    /*
    public int ataque(){

    }*/


}
