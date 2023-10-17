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
public abstract class PaqueteDecorado implements PaqueteTuristico {
    protected double precio;
    protected int duracion;
    protected String descripcion;
    protected PaqueteTuristico paqueteBase;

    public PaqueteDecorado(PaqueteTuristico paqueteBase) {
        this.paqueteBase = paqueteBase;
        this.precio = paqueteBase.getPrecio();
        this.duracion =   paqueteBase.getDuracion();
        this.descripcion = paqueteBase.getDescripcion();
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
