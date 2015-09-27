/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.modelo;

/**
 * Clase Piso_Nuevo heredera de Piso, la cual posee atributos únicos como porcentaje de beneficio de inmobiliaria
 * @author aleivaca9.alumnes
 */
public class Piso_Nuevo extends Piso {
    /** int que guarda el porcentaje de beneficio de la inmobiliaria
     */
    int porcentaje;
    /**
     * Constructor de la clase Piso_Nuevo la cual nos creará un objeto del tipo Piso_Nuevo
     * @param precio Precio del piso
     * @param numero Numero del piso
     * @param superficie Superficie del piso
     * @param direccion Direccion donde se encuentra el piso 
     * @param p Porcentaje de beneficio para la inmobiliaria
     */
   public Piso_Nuevo(double precio, int numero, double superficie, String direccion, int p){
       /**
        * Llamamos al constructor de la clase padre Piso
        */
       super(precio,numero,superficie,direccion);
       porcentaje = p;
       
   }
   /**
    * Metodo que devuelve el porcentaje de beneficio de un piso nuevo
    * @return 
    */
    public int getPorcentaje() {
        return porcentaje;
    }
    /**
     * Metodo que sirve para editar el porcentaje
     * @param p int con el porcentaje
     */
    public void setPorcentaje(int p) {
        porcentaje = p;
    }
    /**
     *Metodo que sirve para mostrar por pantalla un Piso_Nuevo
     * @return 
     */
   @Override
    public String toString() {
        String salida = "Direccion: " + direccion + "\n" + "Piso: " + numpiso + "\n" + "Precio: " + precio + "\n" + "Superficie: " + superficie + "\n" +"Porcentaje: " + porcentaje + "\n";
        return salida;
    }
    /**
     * Metodo que sirve para saber si es un Piso_Prot_Oficial o un Piso_nuevo, devuelve true si es un Piso_Nuevo
     * @return booleano segun el tipo que sea
     */
    @Override
    public boolean tipoPiso() {
        return true;
    }
    
    
}
