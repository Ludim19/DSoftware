/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.servivo.model;

import udem.edu.co.servivo.abstractas.ReinoVegetal;
import udem.edu.co.servivo.interfaz.SerVivo;

/**
 *
 * @author b12s309
 */
public class Cilantro extends ReinoVegetal implements SerVivo {
    private String nombre;
    private String color;
    private double pedad;

    public Cilantro(String nombre, String color, double pedad, String tipovegetal) {
        super(tipovegetal);
        this.nombre = nombre;
        this.color = color;
        this.pedad = pedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPedad() {
        return pedad;
    }

    public void setPedad(int pedad) {
        this.pedad = pedad;
    }

    @Override
    public String toString() {
        return  "{"
                + "cilantro:{"
                + "nombre:"+getNombre()+","
                + "color:"+getColor()+","
                + "pedad:"+getPedad()+","
                + super.toString()
                + "}"
                + "}";
    }

    @Override
    public int finEdad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
