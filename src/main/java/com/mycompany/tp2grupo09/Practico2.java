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
 * @author ALBERTO
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
        Combustible cb;
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
                    System.out.println("Ingrese el nombre, km y ruta de la ciudad");
                    cd = new Ciudad(sc.next(), sc.nextDouble(), sc.nextInt());
                    ciudades.add(cd);
                    break;
                case 2:
                    //System.out.println("Ingrese el tipo y precio del combustible");
                    //cb = new Combustible(sc.next(), sc.nextDouble());
                    cb = new Combustible("Nafta", 100);
                    combustibles.add(cb);
                    cb = new Combustible("Gasoil", 200);
                    combustibles.add(cb);
                    break;
                case 3:
                    System.out.println("Ingrese la marca y patente del vehiculo a continuacion seleccione el tipo de combustible");
                    cb = new Combustible(sc.next(), sc.nextDouble());
                    //NO HICE LA SELECCION DEL COMBUSTIBLE
                    combustibles.add(cb);
                    break;
                case 4:
                    System.out.println("Generar un nuevo viaje");
                    System.out.println("Seleccione una ciudad de origen");
                    System.out.println("Seleccione una ciudad de destino");
                    System.out.println("Ingrese la distancia");
                    System.out.println("Ingrese la cantidad de peajes");
                    break;
                case 0:
                    exit = true;
                    break;
                    
            }

        } while (!exit);
    }    
}
