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
public class PaqueteNature extends PaqueteDecorado {
    public PaqueteNature(PaqueteTuristico paqueteBase) {
        super(paqueteBase);
        this.precio = 720.0;
        this.duracion = 5;
        this.descripcion = "\n--Nature--\n -Visitas al Kualoa Ranch\n -Visita Maui Ocean Center\n -Visita Akaka Falls State Park";
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
