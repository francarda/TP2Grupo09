/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico2;

/**
 *
 * @author ALBERTO
 */
public class Camioneta extends Vehiculo{

    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    @Override
    public double calcularCostoDeCombustible() {
        return this.getCombustible().getPrecio() * 0.1;
    }
    
}