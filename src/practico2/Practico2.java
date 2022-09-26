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
        Ciudad corigen, cdestino;
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
                    ciudades.add(new Ciudad("Bs As", 1, 7));
                    ciudades.add(new Ciudad("San Luis", 800, 7));
                    ciudades.add(new Ciudad("Mendoza", 1200, 7));
                    ciudades.add(new Ciudad("Bs As", 1, 9));
                    ciudades.add(new Ciudad("Rosario", 250, 9));
                    ciudades.add(new Ciudad("Cordoba", 500, 9));
                    ciudades.add(new Ciudad("Tucuman", 1200, 9));
                    ciudades.add(new Ciudad("San Luis", 800, 147));
                    ciudades.add(new Ciudad("San Juan", 900, 147));
                    System.out.println("<-------------------------------------->");
                    System.out.println("Ciudades creadas");
                    ciudades.forEach((c) -> {
                        System.out.println(ciudades.indexOf(c) + " : " + c.getNombre() + " \tRuta " +c.getRuta() );
                    });
                    System.out.println("<-------------------------------------->");
                    break;
                case 2:
                    //System.out.println("Ingrese el tipo y precio del combustible");
                    //cb = new Combustible(sc.next(), sc.nextDouble());
                    cb = new Combustible("Nafta", 100);
                    combustibles.add(cb);
                    cb = new Combustible("Gasoil", 200);
                    combustibles.add(cb);
                    System.out.println("<-------------------------------------->");
                    System.out.println("Combustibles creados");
                    combustibles.forEach((cmb) -> {
                        System.out.println(combustibles.indexOf(cmb) + " : " + cmb.getTipo()+ " Precio $" +cmb.getPrecio() );
                    });
                    System.out.println("<-------------------------------------->");
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
                    System.out.println("<-------------------------------------->");
                    System.out.println("Autos creados");
                    vehiculos.forEach((ve) -> {
                        System.out.println(vehiculos.indexOf(ve) + " : " + ve.getMarca()+ " Patente " +ve.getPatente());
                    });
                    System.out.println("<-------------------------------------->");
                    break;
                case 4:
                    System.out.println("<-------------------------------------->");
                    System.out.println("Generar un nuevo viaje");
                    System.out.println("Seleccione una ciudad de origen");
                    ciudades.forEach((c) -> {
                        System.out.println(ciudades.indexOf(c) + " : " + c.getNombre() + " \tRuta " +c.getRuta() );
                    });
                    corigen = ciudades.get(sc.nextInt());
                    System.out.println("Se seleccionó "+corigen.getNombre());
                    System.out.println("Seleccione una ciudad de destino");
                    ciudades.forEach((c) -> {
                        System.out.println(ciudades.indexOf(c) + " : " + c.getNombre() + " \tRuta " +c.getRuta() );
                    });
                    cdestino = ciudades.get(sc.nextInt());
                    System.out.println("Se seleccionó "+cdestino.getNombre());
                    if( corigen.getRuta() != cdestino.getRuta()){
                        System.out.println("Ingrese la distancia");
                        distancia = sc.nextInt();
                    }
                    System.out.println("Ingrese el vehiculo para el viaje");
                    vehiculos.forEach((ve) -> {
                        System.out.println(vehiculos.indexOf(ve) + " : " + ve.getMarca()+ " Patente " +ve.getPatente());
                    });
                    vehiculo = vehiculos.get(sc.nextInt());
                    System.out.println("Ingrese la cantidad de peajes");
                    cant_peajes = sc.nextInt();            
                    Viaje viaje = new Viaje(corigen, cdestino, distancia, cant_peajes, vehiculo);
                    System.out.println(viaje.CalculoCombustible());
                    System.out.println(viaje.CalculoTotal());
                    System.out.println("<-------------------------------------->");
                    break;
                case 0:
                    exit = true;
                    break;
            }
        } while (!exit);
    } 
}
