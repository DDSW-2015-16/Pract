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
public class Piso {
    double precio;
    int numpiso;
    double superficie;
    String direccion;
    ArrayList<Cliente> llistaVisitas;
    
    //Constructor de la clase Piso
    public Piso(double p, int n, double s, String d) {
        precio = p;
        numpiso = n;
        superficie = s;
        direccion = d;
        llistaVisitas = new ArrayList<Cliente> ();
    }
    //Constructor de la clase Piso
    public Piso() {
        precio = 0;
        numpiso = 0;
        superficie = 0;
        direccion = "";
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
