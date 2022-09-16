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
public class Auto extends Vehiculo{

    public Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    @Override
    public double calcularCostoDeCombustible() {
        //Los autos consumen 7 litros cada 100 => 
        return this.getCombustible().getPrecio() * 0.07;
    }
    
}
