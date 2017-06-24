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
public class Alumno extends Soldado implements Serializable{
    String Apodo;
    int Cuenta;
    int Edad;

    public Alumno(String Apodo, int Cuenta, int Edad, int Resistencia, Arma arma) {
        super(Resistencia, arma);
        this.Apodo = Apodo;
        this.Cuenta = Cuenta;
        this.Edad = Edad;
    }

    public String getApodo() {
        return Apodo;
    }

    public void setApodo(String Apodo) {
        this.Apodo = Apodo;
    }

    public int getCuenta() {
        return Cuenta;
    }

    public void setCuenta(int Cuenta) {
        this.Cuenta = Cuenta;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
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
        return Apodo;
    }
    
}
