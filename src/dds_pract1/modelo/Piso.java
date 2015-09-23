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
/**
 * Clase abstracta padre referente a todo tipo de piso, con caracteristicas como: <br>
 * -Registrar que cliente visita el piso. <br>
 * -Generar una lista de clientes que han visitado el piso . <br>
 * -Poder editar cualquier valor de un piso. <br>
 * -Saber el numero de personas que visitan el piso .<br>
 */

public abstract class Piso {
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
    
    /**
     * Metodo que nos permite editar el precio de un piso
     * @param p  nuevo valor para el precio del piso
     */

    public void setPrecio(double p) {
        precio = p;
    }
    /**
     * Metodo que nos permite editar el numero de un piso
     * @param n nuevo valor para el numero del piso
     */
    public void setNum(int n) {
        numpiso = n;
    }
    /**
     * Metodo que nos permite editar la superficie de un piso
     * @param s Nuevo valor para la superficie del piso
     */
    public void setSuperficie(double s) {
        superficie = s;
    }
    /**
     * Metodo que nos sirve para editar la direccion del piso
     * @param d Nuevo valor para la direccion del piso
     */
    public void setDireccion(String d) {
        direccion = d;
    }
    /**
     * Metodo que devuelve el precio del piso 
     * @return double con el precio del piso
     */
    public double getPrecio() {
        return precio;
    }
    /**
     * Metodo que devuelve el numero del piso
     * @return  int con el valor del piso
     */
    
    public int getNumPiso() {
        return numpiso;
    }
    /**
     * Metodo que devuelve el valor de la superficie del piso
     * @return double con el valor del piso
     */
    public double getSuperficie() {
        return superficie;
    }
    /**
     * Metodo que devuelve la direccion del piso
     * @return  String con la direccion en la que se encuentra el piso
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * Metodo que añade un cliente que ha visitado el piso
     * @param c Objeto cliente que se añade a llistavisitas
     */
    public void AddVisita(Cliente c) {
        llistaVisitas.add(c);
    }
    
    /**
     * Metodo que nos devuelve la lista de clientes que han visitado un piso determinado
     * @return Lista de clientes
     */
    public String ShowVisitas() {
        //Introducimos el titulo de lista de visii
        String salida = "Lista de clientes que han visitado este piso: " + "\n";
        //Usamos un for que recorra la lista de clientes que tiene cada piso
        for (int i = 0; i < llistaVisitas.size(); ++i) {
            //vamos generando el output
            salida += llistaVisitas.get(i) + "\n";
        }
        return salida;
    }
    /**
     * Metodo que nos devuelve el numero de clientes que han visitado un piso dado
     * @return El tamaño de la lista visitas
     */
    public int getNumVisitas(){
        return llistaVisitas.size();
    }
    /**
     * Metodo para saber que tipo de piso se trata si de proteccion o nuevo
     * @return 
     */
    public abstract boolean tipoPiso();
}
