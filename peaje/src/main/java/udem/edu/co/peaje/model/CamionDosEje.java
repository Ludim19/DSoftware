/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package udem.edu.co.peaje.model;

import udem.edu.co.peaje.abstractas.VehiculoMasDeCuatroRuedas;
import udem.edu.co.peaje.interfaz.Vehiculo;

/**
 *
 * @author Santiago Soto
 */
public class CamionDosEje extends VehiculoMasDeCuatroRuedas implements Vehiculo{
    private String placa;
    private String marca;
    private float valor;

    public CamionDosEje(String placa, String marca, float valor,int nruedas) {
        super(nruedas);
        this.placa = placa;
        this.marca = marca;
        this.valor = valor;
        
    }

    @Override
    public String toString() {
        return "{"
                + "CamionDosEje{"
                + "placa:"+getPlaca()+","
                + "marca:"+getMarca()+","
                + "valor:"+getValor()+","
                +super.toString()
                + "}"
             + "}";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String tipoVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
