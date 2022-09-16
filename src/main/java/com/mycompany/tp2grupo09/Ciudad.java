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
public class Ciudad {
    
    private final String nombre;
    private final double km;
    private final int ruta;

    public Ciudad(String nombre, double km, int ruta) {
        this.nombre = nombre;
        this.km = km;
        this.ruta = ruta;
    }

    public String getNombre() {
        return nombre;
    }

    public double getKm() {
        return km;
    }

    public int getRuta() {
        return ruta;
    }
    
}
