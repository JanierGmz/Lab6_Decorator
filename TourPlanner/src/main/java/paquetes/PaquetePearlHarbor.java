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
public class PaquetePearlHarbor extends PaqueteDecorado {
    public PaquetePearlHarbor(PaqueteTuristico paqueteBase) {
        super(paqueteBase);
        this.precio = 653.0;
        this.duracion = 2;
        this.descripcion = "\n--Pearl Harbor--\n -Visita al museo Pearl Harbor\n -Visita al palacio Iolani\n -Visita al museo Bishop\n -USS Arizona Memorial";
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
