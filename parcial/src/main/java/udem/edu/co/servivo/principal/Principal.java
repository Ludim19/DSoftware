/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.servivo.principal;

import java.util.ArrayList;
import java.util.List;
import udem.edu.co.servivo.interfaz.SerVivo;
import udem.edu.co.servivo.model.Brocoli;
import udem.edu.co.servivo.model.Perro;

/**
 *
 * @author b12s309
 */
public class Principal {
    public static void main(String[] args){
        List<SerVivo> seresvivos= new ArrayList<SerVivo>();
        Perro perro1= new Perro("Chester","Negro",8,"Carnivoro");
        Perro perro2= new Perro("Roku","Cafe",10,"Carnivoro");
        Brocoli brocoli1=new Brocoli("Brocoli calabrese","Verde",0.3,"Verdura");
        seresvivos.add(perro1);
        seresvivos.add(perro2);
        seresvivos.add(brocoli1);
        System.out.println("Listado de Seres Vivos");
        System.out.println("{"+"seresvivos:{"+seresvivos.toString()+"}"+"}");
    }
}
