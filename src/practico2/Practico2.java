/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PUESTO-A1
 */
public class Practico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Ciudad> ciudades = new ArrayList<> ();
        List<Combustible> combustibles = new ArrayList<> ();
        List<Vehiculo> vehiculos = new ArrayList<> ();
        Scanner sc = new Scanner(System.in);
        Ciudad cd, corigen, cdestino;
        Vehiculo v, vehiculo;
        Combustible cb;
        int distancia = 0;
        int cant_peajes;
        int opcion;
        boolean exit = false;
        
        do {
            System.out.println("1. Crear ciudad");
            System.out.println("2. Crear combustibles");
            System.out.println("3. Crear vehículo");
            System.out.println("4. Crear viaje");
            System.out.println("0. Salir");
            System.out.println("Elija opción:");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    //System.out.println("Ingrese el nombre, km y ruta de la ciudad");
                    //cd = new Ciudad(sc.next(), sc.nextDouble(), sc.nextInt());
                    ciudades.add(new Ciudad("Buenos Aires", 1, 7));
                    ciudades.add(new Ciudad("Cordoba", 500, 9));
                    ciudades.add(new Ciudad("San Luis", 800, 7));
                    ciudades.add(new Ciudad("Mendoza", 1200, 7));
                    System.out.println("Ciudades creadas");
                    break;
                case 2:
                    //System.out.println("Ingrese el tipo y precio del combustible");
                    //cb = new Combustible(sc.next(), sc.nextDouble());
                    cb = new Combustible("Nafta", 100);
                    combustibles.add(cb);
                    cb = new Combustible("Gasoil", 200);
                    combustibles.add(cb);
                    System.out.println("Combustibles creados");
                    break;
                case 3:
                    //System.out.println("Ingrese la marca y patente del vehiculo a continuacion seleccione el tipo de combustible");
                    //cb = new Combustible(sc.next(), sc.nextDouble());
                    v = new Auto("Ford Focus", "AB345GT", combustibles.get(0));
                    vehiculos.add(v);
                    v = new Camioneta("Renault Kangoo", "AC567UY", combustibles.get(1));
                    vehiculos.add(v);
                    v = new Camioneta("Scania", "BV367RT", combustibles.get(1));
                    vehiculos.add(v);
                    System.out.println("Autos creados");
                    break;
                case 4:
                    System.out.println("Generar un nuevo viaje");
                    System.out.println("Seleccione una ciudad de origen");
                    corigen = ciudades.get(0);
                    System.out.println("Se seleccionó "+corigen.getNombre());
                    System.out.println("Seleccione una ciudad de destino");
                    cdestino = ciudades.get(1);
                    System.out.println("Se seleccionó "+cdestino.getNombre());
                    if( corigen.getRuta() != cdestino.getRuta()){
                        System.out.println("Ingrese la distancia");
                        distancia = sc.nextInt();
                    }
                    System.out.println("Ingrese el vehiculo para el viaje");
                    vehiculo = vehiculos.get(0);
                    System.out.println("Ingrese la cantidad de peajes");
                    cant_peajes = sc.nextInt();            
                    Viaje viaje = new Viaje(corigen, cdestino, distancia, cant_peajes, vehiculo);
                    System.out.println(viaje.CalculoCombustible());
                    System.out.println(viaje.CalculoTotal());
                    break;
                case 0:
                    exit = true;
                    break;
                    
            }

        } while (!exit);
    } 
    
}
