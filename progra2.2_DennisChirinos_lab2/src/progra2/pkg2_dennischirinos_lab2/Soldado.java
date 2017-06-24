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
public class Soldado implements Serializable{
    int Resistencia;
    Arma arma;

    public Soldado(int Resistencia, Arma arma) {
        this.Resistencia = Resistencia;
        this.arma = arma;
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
    
}
