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
public class Aleman extends Soldado implements Serializable{
    String Alias;
    String Casta;

    public Aleman(String Alias, String Casta, int Resistencia, Arma arma) {
        super(Resistencia, arma);
        this.Alias = Alias;
        this.Casta = Casta;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    public String getCasta() {
        return Casta;
    }

    public void setCasta(String Casta) {
        this.Casta = Casta;
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
        return Alias;
    }
    
}
