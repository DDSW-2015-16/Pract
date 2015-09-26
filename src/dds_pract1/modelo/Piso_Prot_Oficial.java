/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dds_pract1.modelo;

/**
 * Clase Piso_Prot_Oficial que crea objetos del tipo Piso_Prot_Oficial que son pisos con
 * la caracteristica especial de tener un id unico para cada piso
 * @author Leiva
 */
public class Piso_Prot_Oficial extends Piso{
    /** int que guarda el identificador del piso de proteccion oficial
     */
    int idprot;
    /**
     * Constructor de la clase Piso_Prot_Oficial
     * @param precio double con el precio del piso
     * @param numero int con el numero del piso
     * @param superficie double con la superficie del piso
     * @param direccion String con la direccion donde se encuentra el piso
     * @param id String con el identificador unico de cada piso
     */
    public Piso_Prot_Oficial(double precio, int numero, double superficie, String direccion, int id){
        //Llamamos al constructor de la clase
        super(precio,numero,superficie,direccion);
       /**
        * Valor unico de cada piso de proteccion oficial
        */
       idprot = id;
       
   }
    /**
     * Metodo que devuelve el id
     * @return devuelve el id unico de cada piso
     */
    public int getIdprot() {
        return idprot;
    }
    /**
     * Metodo que sirve para editar el id de un piso
     * @param id String con el nuevo id del piso
     */
    public void setIdprot(int id) {
       idprot = id;
    }
    /**
     * Metodo que imprime por pantalla un piso de proteccion oficial
     * @return 
     */
  @Override
    public String toString() {
        String salida = "Direccion: " + direccion + "\n" + "Piso: " + numpiso + "\n" + "Precio: " + precio + "\n" + "Superficie: " + superficie + "\n"+ "Identficador: " + idprot + "\n";
        return salida;
    }  
    /**
     * Metodo que sirve para saber si es un Piso_Prot_Oficial o un Piso_nuevo, devuelve false si es Piso_Prot_Oficial
     * @return booleano segun el tipo que sea
     */
    @Override
    public boolean tipoPiso() {
        return false;
    }
    
    
}
