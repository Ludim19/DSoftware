/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package udem.edu.co;

import java.util.ArrayList;
import java.util.List;
import udem.edu.co.edificio.interfaz.Construccion;
import udem.edu.co.edificio.model.Casa;
import udem.edu.co.edificio.model.Edificio;

/**
 *
 * @author b12s309
 */
public class Principal {

    public static void main(String[] args) {
        List<Construccion> construcciones=new ArrayList<Construccion>();
        Construccion construccion1=new Edificio(2);
        Construccion construccion2=new Casa();
        construcciones.add(construccion1);
        construcciones.add(construccion2);
        System.out.println("Hola");
        System.out.println("<construcciones>"+construcciones.toString()+"</construcciones>");
        
    }
}
