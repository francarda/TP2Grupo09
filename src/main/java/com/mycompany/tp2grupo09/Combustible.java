/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tp2grupo09;

/**
 *
 * @author ALBERTO
 */
public class Combustible {
    
    private final String tipo;
    private final double precio;

    public Combustible(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }
    
    
}
