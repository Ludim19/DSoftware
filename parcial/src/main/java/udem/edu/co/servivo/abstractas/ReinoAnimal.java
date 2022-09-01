/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.servivo.abstractas;

/**
 *
 * @author b12s309
 */
public abstract class ReinoAnimal {
    private String tipoanimal;
    //Se define el tipo de animal ya sea carnivoro o herbivoro
    public ReinoAnimal(String tipoanimal) {
        this.tipoanimal = tipoanimal;
    }

    public String getTipoanimal() {
        return tipoanimal;
    }

    public void setTipoanimal(String tipoanimal) {
        this.tipoanimal = tipoanimal;
    }

    @Override
    public String toString() {
        return "tipoanimal:" + getTipoanimal();
    }
    
    
}
