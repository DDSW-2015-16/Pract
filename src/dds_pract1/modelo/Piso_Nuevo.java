/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.modelo;

/**
 *
 * @author aleivaca9.alumnes
 */
public class Piso_Nuevo extends Piso {
    /** int que guarda el porcentaje de beneficio de la inmobiliaria
     */
    int porcentaje;
   public Piso_Nuevo(double precio, int numero, double superficie, String direccion, int porcentaje){
       super(precio,numero,superficie,direccion);
       porcentaje = this.porcentaje;
       
   }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }
   @Override
    public String toString() {
        String salida = "Direccion: " + direccion + "\n" + "Piso: " + numpiso + "\n" + "Precio: " + precio + "\n" + "Superficie: " + superficie + "\n" + porcentaje + "\n";
        return salida;
    }
    
    
}
