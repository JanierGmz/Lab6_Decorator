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
public class PaqueteAmazingHawaii extends PaqueteDecorado {
    public PaqueteAmazingHawaii(PaqueteTuristico paqueteBase) {
        super(paqueteBase);
        this.precio = 931.0;
        this.duracion = 3;
        this.descripcion = "\n--Amazing Hawaii--\n -Escalada en el Waipio Valley\n -Surfear en las playas Waikiki o Hanalei Bay\n -Buseo en Hanauma Bay";
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
