/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_dennischirinos_lab2;

import java.io.Serializable;

/**
 *
 * @author denni
 */
public class Ruso extends Soldado implements Serializable{

    int ID;
    int Edad;
    int Rango;

    public Ruso(int ID, int Edad, int Rango, int Resistencia, Arma arma) {
        super(Resistencia, arma);
        this.ID = ID;
        this.Edad = Edad;
        this.Rango = Rango;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getRango() {
        return Rango;
    }

    public void setRango(int Rango) {
        this.Rango = Rango;
    }

    public int getResistencia() {
        return Resistencia;
    }

    public void setResistencia(int Resistencia) {
        this.Resistencia = Resistencia;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }


    @Override
    public String toString() {
        return this.ID+"";
    }
    

   

}
