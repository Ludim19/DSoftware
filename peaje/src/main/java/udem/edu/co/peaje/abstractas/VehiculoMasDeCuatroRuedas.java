/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.peaje.abstractas;

/**
 *
 * @author Santiago Soto
 */
public abstract class VehiculoMasDeCuatroRuedas {
    private int nruedas;

    public VehiculoMasDeCuatroRuedas(int nruedas) {
        this.nruedas = nruedas;
    }
    
    @Override
    public String toString() {
        return "nruedas:"+getNruedas();
    }

    public int getNruedas() {
        return nruedas;
    }

    public void setNruedas(int nruedas) {
        this.nruedas = nruedas;
    }
    
    
}
