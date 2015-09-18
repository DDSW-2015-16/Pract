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
    
    public Piso(double p, int n, double s, String d) {
        precio = p;
        numpiso = n;
        superficie = s;
        direccion = d;
        llistaVisitas = new ArrayList<Cliente> ();
    }
    public Piso() {
        precio = 0;
        numpiso = 0;
        superficie = 0;
        direccion = "";
        llistaVisitas = new ArrayList<Cliente> ();
    }
    
    public void setPrecio(double p) {
        precio = p;
    }
    
    public void setNum(int n) {
        numpiso = n;
    }
    
    public void setSuperficie(double s) {
        superficie = s;
    }
    
    public void setDireccion(String d) {
        direccion = d;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    public int getNumPiso() {
        return numpiso;
    }
    
    public double getSuperficie() {
        return superficie;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void AddVisita(Cliente c) {
        llistaVisitas.add(c);
    }
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
