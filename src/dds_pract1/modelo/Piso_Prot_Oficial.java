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
    public Piso_Prot_Oficial(double precio, int numero, double superficie, String direccion, int idprot){
       super(precio,numero,superficie,direccion);
       idprot = this.idprot;
       
   }

    public int getIdprot() {
        return idprot;
    }

    public void setIdprot(int idprot) {
        this.idprot = idprot;
    }
  @Override
    public String toString() {
        String salida = "Direccion: " + direccion + "\n" + "Piso: " + numpiso + "\n" + "Precio: " + precio + "\n" + "Superficie: " + superficie + "\n" + idprot + "\n";
        return salida;
    }  
    
    
}
