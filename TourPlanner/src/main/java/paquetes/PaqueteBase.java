/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetes;



/**
 *
 * @author Janier Gomez
 * @author Harold Molano
 */
public class PaqueteBase implements PaqueteTuristico {
    private double precio;
    private int duracion;
    private String descripcion;
    
    public PaqueteBase (){
        this.precio = 7000.0;
        this.duracion =  5;
        this.descripcion = "--Paquete Base-- \n -Tiquetes aéreos \n -Hotel en habitación estándar\n -Alimentación\n -Vuelta a la isla\n -Recepción con lei hawaiano\n -Camiseta de Millonarios";
    }
    
    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public int getDuracion() {
        return duracion;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }
}
