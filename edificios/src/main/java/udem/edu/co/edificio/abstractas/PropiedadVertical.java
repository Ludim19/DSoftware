/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.edificio.abstractas;

/**
 *
 * @author b12s309
 */
public abstract class PropiedadVertical {
    private int area;
    private int pisos;
    
    public PropiedadVertical() {
        this.pisos = 1;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    @Override
    public String toString() {
        return "PropiedadVertical{" + '}';
    }
    
}
