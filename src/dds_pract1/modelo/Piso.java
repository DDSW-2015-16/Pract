/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.modelo;

import java.util.ArrayList;

/**
 *
 * @author mferrema35.alumnes
 */

/** Clase encargada de gestionar lo referente a pisos asi como generar una lista de pisos registrados y que cliente lo visita
 */
public class Piso {
    /** double que nos guarda el precio del piso */
    double precio;
    /** int que nos guarda el numero del piso */
    int numpiso;
    /** double que nos guarda la superficie que tiene el piso*/
    double superficie;
    /** String que nos guarda la dirección donde se encuentra el piso*/
    String direccion;
    /** ArrayList que nos guardara la lista de visitas de casa piso en la lista*/
    ArrayList<Cliente> llistaVisitas;

    /**
     * Constructor que nos generará pisos a partir de los datos introducidos por el usuario
     * @param p precio
     * @param n numero del piso
     * @param s superficie del piso
     * @param d direccion donde se encuentra el piso
     */
    public Piso(double p, int n, double s, String d) {
        precio = p;
        numpiso = n;
        superficie = s;
        direccion = d;
        llistaVisitas = new ArrayList<Cliente> ();
    }
    
    
    //Modificar precio
    public void setPrecio(double p) {
        precio = p;
    }
    //Modifcar numero del piso
    public void setNum(int n) {
        numpiso = n;
    }
    //Modificar Superficie del piso
    public void setSuperficie(double s) {
        superficie = s;
    }
    //Modificar Direccion del piso
    public void setDireccion(String d) {
        direccion = d;
    }
    //Obtener precio del piso
    public double getPrecio() {
        return precio;
    }
    //Obtener numero del piso
    public int getNumPiso() {
        return numpiso;
    }
    //Obtener superficie del piso
    public double getSuperficie() {
        return superficie;
    }
    //Obtener Direccion del piso
    public String getDireccion() {
        return direccion;
    }
    //Añadir visita de un cliente al piso
    public void AddVisita(Cliente c) {
        llistaVisitas.add(c);
    }
    
    //Mostrar visistas del piso
    public String ShowVisitas() {
        String salida = "Lista de visitas: ";
        for (int i = 0; i < llistaVisitas.size(); ++i) {
            salida += llistaVisitas.get(i) + "\n";
        }
        return salida;
    }
    
    @Override
    public String toString() {
        String salida = "Direccion: " + direccion + "\n" + "Piso: " + numpiso + "\n" + "Precio: " + precio + "\n" + "Superficie: " + superficie + "\n";
        return salida;
    }
    
    
}
