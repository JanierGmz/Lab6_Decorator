/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.util.ArrayList;
import java.util.List;
import paquetes.*;

/**
 *
 * @author Janier Gomez
 * @author Harold Molano
 */
public class Control {
    private List<PaqueteDecorado> paquetesDecoradosIndividual = new ArrayList<>();
    private List<PaqueteDecorado> paquetesDecoradosFamilia = new ArrayList<>();
    private PaqueteBase miPaqueteBase = new PaqueteBase();
    
    public void agregarPaqueteIndividual(PaqueteDecorado paquete){
        paquetesDecoradosIndividual.add(paquete);
    }
    public void agregarPaqueteFamiliar(PaqueteDecorado paquete){
        paquetesDecoradosFamilia.add(paquete);
    }
    
    public void mostrarCotizacion(){
        System.out.println("Cotización del Plan Turístico Individual en Hawaii:");
        System.out.println("--------Paquete Base--------");
        System.out.println("Precio: $" + miPaqueteBase.getPrecio());
        System.out.println("Duración: " + miPaqueteBase.getDuracion() + " días");
        System.out.println(miPaqueteBase.getDescripcion());
        mostrarPaquetesAdicionalesIndividual();
        calcularTotales();
    }
    public void mostrarCotizacion(int cantidad){
        System.out.println("Cotización del Plan Turístico Familiar en Hawaii:");
        System.out.println("--------Paquete Base--------");
        System.out.println("Precio: $" + miPaqueteBase.getPrecio() + " por persona.");
        System.out.println("Duración: " + miPaqueteBase.getDuracion() + " días");
        System.out.println(miPaqueteBase.getDescripcion());
        mostrarPaquetesAdicionalesFamiliar();
        calcularTotales(cantidad);
    }
    
    public void mostrarPaquetesAdicionalesIndividual(){
        if (!paquetesDecoradosIndividual.isEmpty()) {
            System.out.println("--------Paquetes Adicionales--------");
            for (PaqueteDecorado paqueteDecorado : paquetesDecoradosIndividual) {
                System.out.println(paqueteDecorado.getDescripcion());
                System.out.println("Precio: $" + paqueteDecorado.getPrecio() + " por persona.");
                System.out.println("Duración: " + paqueteDecorado.getDuracion() + " días\n");
            }
        }
    }
    public void mostrarPaquetesAdicionalesFamiliar(){
        if (!paquetesDecoradosFamilia.isEmpty()) {
            System.out.println("--------Paquetes Adicionales--------");
            for (PaqueteDecorado paqueteDecorado : paquetesDecoradosFamilia) {
                System.out.println(paqueteDecorado.getDescripcion());
                System.out.println("Precio: $" + paqueteDecorado.getPrecio() + " por persona.");
                System.out.println("Duración: " + paqueteDecorado.getDuracion() + " días\n");
            }
        }
    }
    
    public void calcularTotales(){
        double precioTotal = miPaqueteBase.getPrecio();
        int duracionTotal = miPaqueteBase.getDuracion();
        for (PaqueteDecorado paqueteDecorado : paquetesDecoradosIndividual) {
            precioTotal += paqueteDecorado.getPrecio();
            duracionTotal += paqueteDecorado.getDuracion();
        }

        System.out.println("\n-Precio Total del Plan: $" + precioTotal);
        System.out.println("-Duración Total del Plan: " + duracionTotal + " días\n");
    }
    
    public void calcularTotales(int cantidad){
        double precioTotal = miPaqueteBase.getPrecio() * cantidad;
        int duracionTotal = miPaqueteBase.getDuracion();
        for (PaqueteDecorado paqueteDecorado : paquetesDecoradosFamilia) {
            precioTotal += paqueteDecorado.getPrecio() * cantidad;
            duracionTotal += paqueteDecorado.getDuracion();
        }
        System.out.println("\n-Precio Total del Plan Familiar: $" + precioTotal);
        System.out.println("-Duración Total del Plan Familiar: " + duracionTotal + " días\n");
    }

    public List<PaqueteDecorado> getPaquetesDecoradosFamilia() {
        return paquetesDecoradosFamilia;
    }

    public List<PaqueteDecorado> getPaquetesDecoradosIndividual() {
        return paquetesDecoradosIndividual;
    }
    
    public void reiniciar(){
        paquetesDecoradosIndividual.clear();
        paquetesDecoradosFamilia.clear();
    }
}
