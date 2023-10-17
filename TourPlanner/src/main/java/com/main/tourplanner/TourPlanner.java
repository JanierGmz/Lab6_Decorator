/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.main.tourplanner;

import control.Control;
import java.util.Scanner;
import paquetes.*;

/**
 *
 * @author Janier Gomez
 * @author Harold Molano
 */
public class TourPlanner {
    private static Scanner scanner = new Scanner(System.in);
    private static Control controller = new Control();

    public static void main(String[] args) {
        menuPrincipal();
    }
    
    public static void menuPrincipal(){
        int opcion;
        do {
            System.out.println("------MENU PRINCIPAL------");
            System.out.println("1. Individual");
            System.out.println("2. Familiar");
            System.out.println("3. Reiniciar Sistema");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    menuPaquetes();
                    break;
                }
                case 2 ->{
                    System.out.println("Ingrese la cantidad de miembros de la familia:");
                    int cantidad = scanner.nextInt();
                    menuPaquetes(cantidad);
                    break;
                }
                case 3 ->{
                    controller.reiniciar();
                    System.out.println("--Sistema reiniciado--");
                    break;
                }
                case 4 ->{
                    System.out.println("Hasta Pronto :)");
                }
            }
        }while(opcion != 4);
    }
    
    private static void  menuPaquetes(){
        PaqueteTuristico paqueteBase = new PaqueteBase();
        
        int opcion;
        do {
            System.out.println("--Configuración Individual de Planes Turísticos en Hawaii--");
            System.out.println("1. Agregar paquete Pearl Harbor");
            System.out.println("2. Agregar paquete Nature");
            System.out.println("3. Agregar paquete Amazing Hawaii");
            System.out.println("4. Ver cotización");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    PaqueteDecorado pearlHarbor = new PaquetePearlHarbor(paqueteBase);
                    if (!controller.getPaquetesDecoradosFamilia().contains(pearlHarbor)) {
                        controller.agregarPaqueteIndividual(pearlHarbor);
                        System.out.println("Paquete Pearl Harbor agregado.");
                    } else {
                        System.out.println("El paquete Pearl Harbor ya está agregado.");
                    }
                    
                }
                case 2 -> {
                    PaqueteDecorado nature = new PaqueteNature(paqueteBase);
                    if (!controller.getPaquetesDecoradosFamilia().contains(nature)) {
                        controller.agregarPaqueteIndividual(nature);
                        System.out.println("Paquete Nature agregado.");
                    } else {
                        System.out.println("El paquete Nature ya está agregado.");
                    }
                }
                case 3 -> {
                    PaqueteDecorado amazingHawaii = new PaqueteAmazingHawaii(paqueteBase);
                    if (!controller.getPaquetesDecoradosFamilia().contains(amazingHawaii)) {
                        controller.agregarPaqueteIndividual(amazingHawaii);
                        System.out.println("Paquete Amazing Hawaii agregado.");
                    } else {
                        System.out.println("El paquete Amazing Hawaii ya está agregado.");
                    }
                }
                case 4 ->{
                    controller.mostrarCotizacion();
                }
                case 5 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 5);
    }
    private static void  menuPaquetes(int cantidad){
        PaqueteTuristico paqueteBase = new PaqueteBase();
        
        int opcion;
        do {
            System.out.println("--Configuración Familiar de Planes Turísticos en Hawaii--");
            System.out.println("1. Agregar paquete Pearl Harbor");
            System.out.println("2. Agregar paquete Nature");
            System.out.println("3. Agregar paquete Amazing Hawaii");
            System.out.println("4. Ver cotización");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> {
                    PaqueteDecorado pearlHarbor = new PaquetePearlHarbor(paqueteBase);
                    if (!controller.getPaquetesDecoradosFamilia().contains(pearlHarbor)) {
                        controller.agregarPaqueteFamiliar(pearlHarbor);
                        System.out.println("Paquete Pearl Harbor agregado.");
                    } else {
                        System.out.println("El paquete Pearl Harbor ya está agregado.");
                    }
                    
                }
                case 2 -> {
                    PaqueteDecorado nature = new PaqueteNature(paqueteBase);
                    if (!controller.getPaquetesDecoradosFamilia().contains(nature)) {
                        controller.agregarPaqueteFamiliar(nature);
                        System.out.println("Paquete Nature agregado.");
                    } else {
                        System.out.println("El paquete Nature ya está agregado.");
                    }
                }
                case 3 -> {
                    PaqueteDecorado amazingHawaii = new PaqueteAmazingHawaii(paqueteBase);
                    if (!controller.getPaquetesDecoradosFamilia().contains(amazingHawaii)) {
                        controller.agregarPaqueteFamiliar(amazingHawaii);
                        System.out.println("Paquete Amazing Hawaii agregado.");
                    } else {
                        System.out.println("El paquete Amazing Hawaii ya está agregado.");
                    }
                }
                case 4 ->{
                    controller.mostrarCotizacion(cantidad);
                }
                case 5 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 5);
    }
}
