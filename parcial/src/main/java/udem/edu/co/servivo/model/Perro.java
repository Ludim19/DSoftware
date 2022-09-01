/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.servivo.model;

import udem.edu.co.servivo.abstractas.ReinoAnimal;
import udem.edu.co.servivo.interfaz.SerVivo;

/**
 *
 * @author b12s309
 */
public class Perro extends ReinoAnimal implements SerVivo {
    private String nombre;
    private String color;
    private int pedad;

    public Perro(String nombre, String color, int pedad,String tipoanimal) {
        super(tipoanimal);
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

    public int getPedad() {
        return pedad;
    }

    public void setPedad(int pedad) {
        this.pedad = pedad;
    }

    @Override
    public String toString() {
        return  "{"
                + "perro:{"
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
