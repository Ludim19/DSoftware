/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.peaje.abstractas;

/**
 *
 * @author Santiago Soto
 */
public abstract class VehiculoCuatroRuedas {
    private int nruedas;

    public VehiculoCuatroRuedas() {
        this.nruedas = 4;
    }

    public int getNruedas() {
        return nruedas;
    }

    public void setNruedas(int nruedas) {
        this.nruedas = nruedas;
    }

    @Override
    public String toString() {
        return "nruedas:" + nruedas;
    }
    
    
}
