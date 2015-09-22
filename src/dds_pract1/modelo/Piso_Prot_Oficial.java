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
public class Piso_Prot_Oficial extends Piso{
    /** int que guarda el identificador del piso de proteccion oficial
     */
    int idprot;
    public Piso_Prot_Oficial(double precio, int numero, double superficie, String direccion, int id){
       super(precio,numero,superficie,direccion);
       idprot = id;
       
   }

    public int getIdprot() {
        return idprot;
    }

    public void setIdprot(int id) {
       idprot = id;
    }
  @Override
    public String toString() {
        String salida = "Direccion: " + direccion + "\n" + "Piso: " + numpiso + "\n" + "Precio: " + precio + "\n" + "Superficie: " + superficie + "\n"+ "Identficador: " + idprot + "\n";
        return salida;
    }  
    /*
    Devuelve false cuando el piso es de proteccion oficial
    */
    @Override
    public boolean tipoPiso() {
        return false;
    }
    
    
}
