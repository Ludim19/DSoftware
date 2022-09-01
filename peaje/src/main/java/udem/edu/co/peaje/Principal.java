/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.peaje;

import java.util.ArrayList;
import java.util.List;
import udem.edu.co.peaje.interfaz.Vehiculo;
import udem.edu.co.peaje.model.Automovil;
import udem.edu.co.peaje.model.CamionDosEje;

/**
 *
 * @author Santiago Soto
 */
public class Principal {
    public static void main(String[] args){
    List<Vehiculo> vehiculos= new ArrayList<Vehiculo>();
    
    Automovil auto1= new Automovil("ABC123", "BMW", 15500);
        CamionDosEje camion1= new CamionDosEje("OPS231", "W", 20000, 6);
    
    
    vehiculos.add(auto1);
    vehiculos.add(camion1);
        System.out.println(vehiculos.toString());
    }
}
