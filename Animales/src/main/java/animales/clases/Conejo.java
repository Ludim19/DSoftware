/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales.clases;

import animales.abstractas.Herbivoro;

/**
 *
 * @author b12s309
 */
public class Conejo extends Herbivoro{
    public String raza;
    public String color;
    public String estatura;
    public String edad;
    
    public Conejo(String raza,String color,String estatura, String edad){
    this.raza=raza;
    this.color=color;
    this.estatura=estatura;
    this.edad=edad;
    }
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    
}
