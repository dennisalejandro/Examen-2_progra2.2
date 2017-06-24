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
public class Arma implements Serializable{
    String Tipo;
    String Pais;
    int Poder;

    public Arma(String Tipo, String Pais, int Poder) {
        this.Tipo = Tipo;
        this.Pais = Pais;
        this.Poder = Poder;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public int getPoder() {
        return Poder;
    }

    public void setPoder(int Poder) {
        this.Poder = Poder;
    }

    @Override
    public String toString() {
        return Tipo;
    }
    
    
}
