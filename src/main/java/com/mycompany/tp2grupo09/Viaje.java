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
public class Viaje {
    
    private Ciudad origen;
    private Ciudad destino;
    private double distancia;
    private int cant_peajes;
    private Vehiculo vehiculo;
   
    public Viaje(Ciudad origen, Ciudad destino, double distancia, int cant_peajes, Vehiculo vehiculo) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.cant_peajes = cant_peajes;
        this.vehiculo = vehiculo;
    }

    public Viaje(Ciudad origen, Ciudad destino, int cant_peajes, Vehiculo vehiculo) {
        this.origen = origen;
        this.destino = destino;
        this.cant_peajes = cant_peajes;
        this.vehiculo = vehiculo;
        this.distancia = 0;
    }    


    public Ciudad getOrigen() {
        return origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public int getCant_peajes() {
        return cant_peajes;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
    public double CalculoDistancia(){
        if( this.distancia == 0){
        //if( this.getDestino().getRuta() == this.getOrigen().getRuta())
            return this.destino.getKm() - this.origen.getKm();
        } else {
            return this.distancia;
        }
    }

    public double CalculoPeajes(){
        //CONSULTAR EL VALOR DE CADA PEAJE
        return this.cant_peajes * 100;
    }
    
    public double CalculoCombustible(){
        return this.CalculoDistancia() * this.vehiculo.calcularCostoDeCombustible();
    }
    
    public double CalculoTotal(){
        return this.CalculoDistancia() + this.CalculoPeajes();
    }
}
