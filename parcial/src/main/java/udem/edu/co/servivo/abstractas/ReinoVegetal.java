/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.servivo.abstractas;

/**
 *
 * @author b12s309
 */
public abstract class ReinoVegetal {
    private String tipovegetal;

    public ReinoVegetal(String tipovegetal) {
        this.tipovegetal = tipovegetal;
    }

    public String getTipovegetal() {
        return tipovegetal;
    }

    public void setTipovegetal(String tipovegetal) {
        this.tipovegetal = tipovegetal;
    }

    @Override
    public String toString() {
        return "tipovegetal:" + getTipovegetal();
    }
    
}
