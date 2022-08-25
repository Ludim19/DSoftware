/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.edificio.model;
import udem.edu.co.edificio.abstractas.PropiedadHorizontal;
import udem.edu.co.edificio.abstractas.PropiedadVertical;
import udem.edu.co.edificio.interfaz.Construccion;
/**
 *
 * @author b12s309
 */
public class Casa extends PropiedadVertical implements Construccion {
    private String color;
    private String nombre;
    @Override
    public int finEdad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "<construccion>"
                +"<nombre>"+this.nombre+"</nombre>"
                +"<color>"+this.color+"</color>"
                +super.toString()
                +"</construccion>";
    }
    //Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
