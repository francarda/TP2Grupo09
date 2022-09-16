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
public abstract class Vehiculo {
    
    private final String marca;
    private final String patente;
    private final Combustible combustible;

    public Vehiculo(String marca, String patente, Combustible combustible) {
        this.marca = marca;
        this.patente = patente;
        this.combustible = combustible;
    }

   public String getMarca() {
        return marca;
    }

    public String getPatente() {
        return patente;
    }

    public Combustible getCombustible() {
        return combustible;
    }
    
    public abstract double calcularCostoDeCombustible();
            
    
}
